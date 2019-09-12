package br.ufpe.cin.if688;

import br.ufpe.cin.if688.parsing.analysis.GeneralSymbol;
import br.ufpe.cin.if688.parsing.analysis.SetGenerator;
import br.ufpe.cin.if688.parsing.analysis.SpecialSymbol;
import br.ufpe.cin.if688.parsing.grammar.Grammar;
import br.ufpe.cin.if688.parsing.grammar.Nonterminal;
import br.ufpe.cin.if688.parsing.grammar.Production;
import br.ufpe.cin.if688.parsing.grammar.Terminal;
import br.ufpe.cin.if688.table.LL1Key;
import br.ufpe.cin.if688.table.NotLL1Exception;
import br.ufpe.cin.if688.table.Table;

import java.util.*;
import java.util.stream.Collectors;

// Nao mexa aqui, so envie no Iudex

public class Main {
    public static void main(String[] args) {
        List<Production> ps = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                String rule = scanner.nextLine();
                String[] hs = Arrays.stream(rule.split("->"))
                        .map(String::trim)
                        .collect(Collectors.toList())
                        .toArray(new String[]{});

                Nonterminal lhs = new Nonterminal(hs[0]);
                List<GeneralSymbol> rhs = Arrays.stream(hs[1].split(""))
                        .map(s -> {
                            char c = s.charAt(0);
                            if (c == '^')
                                return SpecialSymbol.EPSILON;
                            if (c == '$')
                                return SpecialSymbol.EOF;
                            if ('A' <= c && c <= 'Z')
                                return new Nonterminal(s);
                            return new Terminal(s);
                        })
                        .collect(Collectors.toList());

                Production p = new Production(lhs, rhs);
                ps.add(p);
            }
        }
        Grammar g = new Grammar(ps, ps.get(0).getNonterminal());
        System.out.print(g);
        Map<Nonterminal, Set<GeneralSymbol>> first = SetGenerator.getFirst(g);
        System.out.println(sortFirst(first));
        Map<Nonterminal, Set<GeneralSymbol>> follow = SetGenerator.getFollow(g, first);
        System.out.println(sortFirst(follow));
        try {
            Map<LL1Key, List<GeneralSymbol>> table = Table.createTable(g);
            System.out.println(sortTable(table));
        } catch (NotLL1Exception e) {
            throw new RuntimeException(e);
        }
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

    static private Map<Nonterminal, Set<GeneralSymbol>> sortFirst( Map<Nonterminal, Set<GeneralSymbol>> parsingTable) {
        // This sorts only the key, as the values in the set must be in the order of the rule
        Map<Nonterminal, Set<GeneralSymbol>> sortedMap = new TreeMap<Nonterminal, Set<GeneralSymbol>>(new Comparator<Nonterminal>() {
            public int compare(Nonterminal t1, Nonterminal t2) {
                return t1.toString().compareTo(t2.toString());
            }
        });

        parsingTable.forEach((k,v)->{
            sortedMap.put(k, v);
        });

        return sortedMap;
    }
}

/*
E -> TA
A -> +TA
A -> ^
T -> FB
B -> *FB
B -> ^
F -> (E)
F -> i
 */

