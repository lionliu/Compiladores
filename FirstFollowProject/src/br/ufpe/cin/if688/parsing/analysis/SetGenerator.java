package br.ufpe.cin.if688.parsing.analysis;

import br.ufpe.cin.if688.parsing.grammar.Grammar;
import br.ufpe.cin.if688.parsing.grammar.Nonterminal;
import br.ufpe.cin.if688.parsing.grammar.Production;
import br.ufpe.cin.if688.parsing.grammar.Terminal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public final class SetGenerator {

    public static void searchTerminal(Grammar g, Set<GeneralSymbol> conj, GeneralSymbol s, Production originalProd, int iter) {
        if(s instanceof Terminal) {
            conj.add(s);
        } else {
            for(Production p1: g.getProductions()) {
                if(p1.getNonterminal().equals(s)) {
                    GeneralSymbol s1 = p1.getProduction().get(0);
                    if(s1 instanceof Terminal) {
                        conj.add(s1);
                    } else if(s1 instanceof SpecialSymbol) {
                        try {
                            GeneralSymbol next = originalProd.getProduction().get(iter+1);
                            if(next instanceof Terminal) {
                                conj.add(next);
                            } else {
                                searchTerminal(g, conj, next, originalProd, iter+1);
                            }
                        } catch (IndexOutOfBoundsException e) {
                            conj.add(s1);
                        }
                    } else {
                        searchTerminal(g, conj, s1, originalProd, iter);
                    }
                }
            }
        }
    }

    public static Map<Nonterminal, Set<GeneralSymbol>> getFirst(Grammar g) {

        if (g == null) throw new NullPointerException("g nao pode ser nula.");

        Map<Nonterminal, Set<GeneralSymbol>> first = initializeNonterminalMapping(g);

        for(Production p : g.getProductions()) {
            GeneralSymbol s = p.getProduction().get(0);
            if(s instanceof Terminal) {
                first.get(p.getNonterminal()).add(s);
            } else if(s instanceof SpecialSymbol) {
                first.get(p.getNonterminal()).add(s);
            } else {
                searchTerminal(g, first.get(p.getNonterminal()), s, p, 0);
            }
        }
        return first;
    }

    public static Map<Nonterminal, Set<GeneralSymbol>> getFollow(Grammar g, Map<Nonterminal, Set<GeneralSymbol>> first) {

        if (g == null || first == null)
            throw new NullPointerException();

        Map<Nonterminal, Set<GeneralSymbol>> follow = initializeNonterminalMapping(g);
        Set<GeneralSymbol> x = new HashSet<>();
        x.add(SpecialSymbol.EOF);
        follow.put(g.getStartSymbol(), x);
        for(int f = 0; f < g.getProductions().size(); f++) {
            for(Production p: g.getProductions()) {
                // FOLLOW(A)
                Set<GeneralSymbol> followNonTerminal = follow.get(p.getNonterminal());
                for(int i = p.getProduction().size() - 1; i >= 0; i--) {
                    GeneralSymbol actual = p.getProduction().get(i);
                    if(actual instanceof Nonterminal) {
                        try {
                            GeneralSymbol next = p.getProduction().get(i + 1);
                            // Se o next for um Nao terminal
                            if(next instanceof Nonterminal) {
                                for(GeneralSymbol d: first.get(next)) {
                                    if(!d.equals(SpecialSymbol.EPSILON)) {
                                        follow.get(actual).add(d);
                                    }
                                }
                                // Se o first do next possuir epsilon,
                                if(first.get(next).contains(SpecialSymbol.EPSILON)) {
//                                    follow.put(actual, )
                                    if(i != p.getProduction().size() - 1) {
                                        for(GeneralSymbol d: follow.get(next)) {
                                            follow.get(actual).add(d);
                                        }
                                    } else if(i == p.getProduction().size() - 1){
                                        for(GeneralSymbol h: follow.get(p.getNonterminal())) {
                                            follow.get(actual).add(h);
                                        }
                                    }

                                }
                            } else if(!next.equals(SpecialSymbol.EPSILON)) {
                                // Se for um terminal adiciona no follow do atual
                                follow.get(actual).add(next);
                            }
                        } catch (IndexOutOfBoundsException e) {
                            for(GeneralSymbol fnt: followNonTerminal) {
                                follow.get(actual).add(fnt);
                            }
                        }
                    }
                }
            }
        }


        return follow;
    }

    //método para inicializar mapeamento nãoterminais -> conjunto de símbolos
    private static Map<Nonterminal, Set<GeneralSymbol>>
    initializeNonterminalMapping(Grammar g) {
        Map<Nonterminal, Set<GeneralSymbol>> result =
                new HashMap<Nonterminal, Set<GeneralSymbol>>();

        for (Nonterminal nt: g.getNonterminals())
            result.put(nt, new HashSet<GeneralSymbol>());

        return result;
    }

}
