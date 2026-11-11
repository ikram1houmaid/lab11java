package ex2;


import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Apprendre Java Collections"));
        tasks.add(new Task("Faire les courses"));
        tasks.add(new Task("Préparer les exercices"));

        tasks.get(0).setCompleted(true);

        System.out.println("=== Liste des tâches ===");

        for (Task t : tasks) {
            System.out.println(t);
        }

        System.out.println("\n=== Tâches non terminées ===");

        for (Task t : tasks) {
            if (!t.isCompleted()) {
                System.out.println(t);
            }
        }
    }
}
