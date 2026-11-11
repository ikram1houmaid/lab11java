package ex3;


import java.util.*;

public class SetComparison {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>(
            Arrays.asList("Zèbre", "Ananas", "Banane")
        );

        Set<String> linkedHashSet = new LinkedHashSet<>(
            Arrays.asList("Zèbre", "Ananas", "Banane")
        );

        Set<String> treeSet = new TreeSet<>(
            Arrays.asList("Zèbre", "Ananas", "Banane")
        );

        System.out.println("HashSet (non ordonné) : " + hashSet);

        System.out.println("LinkedHashSet (ordre d'insertion) : "
                + linkedHashSet);

        System.out.println("TreeSet (trié alphabétiquement) : "
                + treeSet);
    }
}
