
import java.util.Scanner;

public class ToDoApp {

    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("===== To-Do List Application =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Edit Tasks");
            System.out.println("4. Mark Task as Completed");
            System.out.println("5. Delete Task");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 ->
                    taskManager.addTask();
                case 2 ->
                    taskManager.viewTasks();
                case 3 ->
                    taskManager.editTask();
                case 4 ->
                    taskManager.markTaskAsCompleted();
                case 5 ->
                    taskManager.deleteTask();
                case 6 -> {
                    System.out.println("Exiting the application.");
                    return;
                }
                default ->
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}
