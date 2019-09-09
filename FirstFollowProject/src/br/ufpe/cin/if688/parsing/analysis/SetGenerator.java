package br.ufpe.cin.if688.parsing.analysis;

import br.ufpe.cin.if688.parsing.grammar.Grammar;
import br.ufpe.cin.if688.parsing.grammar.Nonterminal;
import br.ufpe.cin.if688.parsing.grammar.Terminal;
import br.ufpe.cin.if688.parsing.grammar.Production;

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
        /*
         * Implemente aqui o método para retornar o conjunto first
         */
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

        /*
         * implemente aqui o método para retornar o conjunto follow
         */

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
