
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    ArrayList<Tasks> task = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        Tasks newTask = new Tasks(title);
        task.add(newTask);
        System.out.println("Task added Successfully");
    }

    public void viewTasks() {
        System.out.println("All Tasks:");
        for (Tasks t : task) {
            System.out.println(t);
        }
    }

    public void markTaskAsCompleted() {
        System.out.print("Enter task index to mark as completed: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 
        if (index >= 0 && index < task.size()) {
            task.get(index).markAsCompleted();
            System.out.println("Task marked as completed");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void editTask() {
        System.out.print("Enter task index to edit: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index >= 0 && index < task.size()) {
            System.out.print("Enter new title for the task: ");
            String newTitle = scanner.nextLine();
            task.get(index).setTitle(newTitle);
            System.out.println("Task Updated Successfully");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void deleteTask() {
        System.out.print("Enter task index to delete: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index >= 0 && index < task.size()) {
            task.remove(index);
            System.out.println("Task Deleted Successfully ");
        } else {
            System.out.println("Invalid index.");
        }
    }

}
