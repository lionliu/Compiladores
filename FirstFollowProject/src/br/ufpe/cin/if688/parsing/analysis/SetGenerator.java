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

        follow.get(g.getStartSymbol()).add(SpecialSymbol.EOF);
        // TODO implementar o while até que fique com o conj clone igual.
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
                                for(GeneralSymbol d: followNonTerminal) {
                                    follow.get(actual).add(d);
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

        return follow;
    }

//    public static void searchNext(Grammar g, Nonterminal actual, Nonterminal generator, Map<Nonterminal, Set<GeneralSymbol>> follow, Map<Nonterminal, Set<GeneralSymbol>> first) {
//        for(Production p: g.getProductions()) {
//            for(int i = 0; i < p.getProduction().size(); i++) {
//                if(generator.equals(p.getProduction().get(i))) {
//                    try {
//                        GeneralSymbol next = p.getProduction().get(i+1);
//                        if(!next.equals(actual)) {
//                            if(next instanceof Terminal) {
//                                follow.get(actual).add(next);
//                            } else if(next instanceof Nonterminal) {
//                                for(GeneralSymbol f: first.get(next)) {
//                                    if(!f.equals(SpecialSymbol.EPSILON)) {
//                                        follow.get(actual).add(f);
//                                    }
//
//                                }
//                            }
//                        }
//                    } catch (IndexOutOfBoundsException e) {
//                        follow.get(actual).add(SpecialSymbol.EOF);
//                    }
//                }
//            }
//        }
//    }

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
