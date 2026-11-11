package ex5;


public class Main {

    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("978-2123456803",
                "Java Avancé", "Auteur A");

        Book b2 = new Book("978-2123456804",
                "Python Débutant", "Auteur B");

        Book b3 = new Book("978-2123456805",
                "Programmation C++", "Auteur C");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        lib.addCategory("Informatique");
        lib.addCategory("Programmation");
        lib.addCategory("Informatique");

        lib.displayBooks();

        lib.displayCategories();

        System.out.println("\n--- Recherche par ISBN ---");

        Book found = lib.findByIsbn("978-2123456803");

        if (found != null) {
            System.out.println("Livre trouvé : " + found);
        } else {
            System.out.println("Livre introuvable !");
        }

        System.out.println("\n--- Gestion des emprunts ---");

        boolean result1 = lib.borrowBook(b1, "Alice");

        if (result1) {
            System.out.println("Emprunt réussi pour Alice.");
        } else {
            System.out.println("Livre déjà emprunté.");
        }

        boolean result2 = lib.borrowBook(b1, "Bob");

        if (result2) {
            System.out.println("Emprunt réussi pour Bob.");
        } else {
            System.out.println("Impossible : livre déjà emprunté.");
        }

        lib.displayLoans();

        System.out.println("\n--- Restitution ---");

        lib.returnBook(b1);
        System.out.println("Le livre a été restitué.");

        boolean result3 = lib.borrowBook(b1, "Bob");

        if (result3) {
            System.out.println("Nouvel emprunt réussi pour Bob.");
        } else {
            System.out.println("Livre déjà emprunté.");
        }

        lib.displayLoans();
    }
}
