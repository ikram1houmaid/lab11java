package ex3;


import java.util.HashSet;
import java.util.Set;

public class UniqueWords {

    public static void main(String[] args) {

        String text = "chat chien chat souris oiseau chien";

        String[] wordsArray = text.split(" ");

        Set<String> uniqueWords = new HashSet<>();

        for (String w : wordsArray) {
            uniqueWords.add(w);
        }

        System.out.println("Mots uniques : " + uniqueWords);
    }
}
