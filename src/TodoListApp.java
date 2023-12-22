import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {
    private static ArrayList<TodoTask> todoTasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Lisää tehtävä");
            System.out.println("2. Merkitse tehtävä suoritetuksi");
            System.out.println("3. Näytä kaikki tehtävät");
            System.out.println("4. Poistu");
            System.out.print("Valitse toiminto: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Tyhjennä rivinvaihto

            switch (choice) {
                case 1:
                    System.out.print("Syötä tehtävä: ");
                    String taskName = scanner.nextLine();
                    todoTasks.add(new TodoTask(taskName));
                    break;
                case 2:
                    System.out.print("Anna tehtävän numero, jonka haluat merkitä suoritetuksi: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < todoTasks.size()) {
                        todoTasks.get(index).setCompleted(true);
                    } else {
                        System.out.println("Virheellinen indeksi!");
                    }
                    break;
                case 3:
                    for (int i = 0; i < todoTasks.size(); i++) {
                        System.out.println(i + ". " + todoTasks.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Kiitos käytöstä!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Virheellinen valinta!");
            }
        }
    }
}
