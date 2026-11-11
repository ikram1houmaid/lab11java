package ex4;


import java.util.HashMap;
import java.util.Map;

public class BilingualDictionary {

    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("cat", "chat");
        dictionary.put("dog", "chien");
        dictionary.put("bird", "oiseau");
        dictionary.put("book", "livre");
        dictionary.put("house", "maison");

        System.out.println("Traduction de 'dog' : "
                + dictionary.get("dog"));

        System.out.println("\n--- Dictionnaire complet ---");

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " -> "
                    + entry.getValue());
        }

        System.out.println("\n--- Liste des mots anglais ---");

        for (String key : dictionary.keySet()) {
            System.out.println(key);
        }

        System.out.println("\n--- Liste des traductions françaises ---");

        for (String value : dictionary.values()) {
            System.out.println(value);
        }
    }
}

