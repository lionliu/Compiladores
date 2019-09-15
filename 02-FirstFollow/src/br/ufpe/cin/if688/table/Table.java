package br.ufpe.cin.if688.table;


import br.ufpe.cin.if688.parsing.analysis.*;
import br.ufpe.cin.if688.parsing.grammar.*;
import java.util.*;


public final class Table {
    private Table() {    }

    public static Map<LL1Key, List<GeneralSymbol>> createTable(Grammar g) throws NotLL1Exception {
        if (g == null) throw new NullPointerException();

        Map<Nonterminal, Set<GeneralSymbol>> first =
                SetGenerator.getFirst(g);
        Map<Nonterminal, Set<GeneralSymbol>> follow =
                SetGenerator.getFollow(g, first);

        Map<LL1Key, List<GeneralSymbol>> parsingTable =
                new HashMap<LL1Key, List<GeneralSymbol>>();

        for(Production p: g.getProductions()) {
            if(p.getProduction().get(0) instanceof Terminal) {
                // Se for terminal, adiciona no M[p.getNonterminal, p.getProduction().get(0)]
                LL1Key temp = new LL1Key(p.getNonterminal(), p.getProduction().get(0));
                parsingTable.put(temp, p.getProduction());
            } else if(p.getProduction().get(0).equals(SpecialSymbol.EPSILON)) {
                // Se for epsilon preenche a tabela do com follow do p.getNonterminal
                for(GeneralSymbol b: follow.get(p.getNonterminal())) {
                    LL1Key temp2 = new LL1Key(p.getNonterminal(), b);
                    parsingTable.put(temp2, p.getProduction());
                }
            } else if(p.getProduction().get(0) instanceof Nonterminal) {
                for(GeneralSymbol s: first.get(p.getProduction().get(0))) {
                    LL1Key temp = new LL1Key(p.getNonterminal(), s);
                    parsingTable.put(temp, p.getProduction());
                }
            }

        }
        System.out.print(g);
        System.out.println(first);
        System.out.println(follow);
        System.out.println(sortTable(parsingTable));

        return sortTable(parsingTable);
    }

    static private Map<LL1Key, List<GeneralSymbol>> sortTable( Map<LL1Key, List<GeneralSymbol>> parsingTable) {
        // This sorts only the key, as the values in the set must be in the order of the rule
        Map<LL1Key, List<GeneralSymbol>> sortedMap = new TreeMap<LL1Key, List<GeneralSymbol>>(new Comparator<LL1Key>() {
            @Override
            public int compare(LL1Key t1, LL1Key t2) {
                return t1.toString().compareTo(t2.toString());
            }
        });

        parsingTable.forEach((k,v)->{
            sortedMap.put(k, v);
        });

        return sortedMap;
    }

}
