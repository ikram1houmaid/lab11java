package ex1;


import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {

    public static void main(String[] args) {


        List<String> shoppingList = new ArrayList<>();

        shoppingList.add("Pommes");
        shoppingList.add("Lait");
        shoppingList.add("Pain");

        System.out.println("Articles de la liste :");

        for (String item : shoppingList) {
            System.out.println("- " + item);
        }

        shoppingList.remove("Lait");

        System.out.println("\nAprès suppression du lait :");

        for (String item : shoppingList) {
            System.out.println("- " + item);
        }

        boolean hasApples = shoppingList.contains("Pommes");

        System.out.println("\nContient des pommes ? " + hasApples);

        System.out.println("Taille finale de la liste : "
                + shoppingList.size());
    }
}
