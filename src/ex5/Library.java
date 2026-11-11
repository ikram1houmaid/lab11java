package ex5;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Library {

    private List<Book> books = new ArrayList<>();

    private Set<String> categories = new HashSet<>();

    private Map<String, Book> isbnIndex = new HashMap<>();

    private Map<Book, String> loans = new HashMap<>();

    public void addBook(Book book) {
        books.add(book);
        isbnIndex.put(book.getIsbn(), book);
    }

    public void addCategory(String category) {
        categories.add(category);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Set<String> getCategories() {
        return categories;
    }

    public Book findByIsbn(String isbn) {
        return isbnIndex.get(isbn);
    }

    public boolean borrowBook(Book book, String borrower) {

        if (!loans.containsKey(book)) {
            loans.put(book, borrower);
            return true;
        }

        return false;
    }

    // Restituer un livre
    public void returnBook(Book book) {
        loans.remove(book);
    }

    public void displayBooks() {
        System.out.println("--- Liste des livres ---");

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayCategories() {
        System.out.println("--- Catégories ---");

        for (String category : categories) {
            System.out.println(category);
        }
    }

    // Afficher les emprunts
    public void displayLoans() {
        System.out.println("--- Livres empruntés ---");

        for (Map.Entry<Book, String> entry : loans.entrySet()) {
            System.out.println(entry.getKey()
                    + " | Emprunteur : " + entry.getValue());
        }
    }
}
