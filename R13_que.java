//13.Write a program to demonstrate the addition and deletion of elements in deque.
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class R13_que {
    public static void main(String[] args) {
        // Create a Deque (double-ended queue) using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Add element to the front");
            System.out.println("2. Add element to the back");
            System.out.println("3. Remove element from the front");
            System.out.println("4. Remove element from the back");
            System.out.println("5. Display elements in deque");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter element to add to the front: ");
                    String frontElement = scanner.nextLine();
                    deque.addFirst(frontElement);
                    break;
                case "2":
                    System.out.print("Enter element to add to the back: ");
                    String backElement = scanner.nextLine();
                    deque.addLast(backElement);
                    break;
                case "3":
                    if (!deque.isEmpty()) {
                        String removedFront = deque.removeFirst();
                        System.out.println("Removed from front: " + removedFront);
                    } else {
                        System.out.println("Deque is empty, nothing to remove from front.");
                    }
                    break;
                case "4":
                    if (!deque.isEmpty()) {
                        String removedBack = deque.removeLast();
                        System.out.println("Removed from back: " + removedBack);
                    } else {
                        System.out.println("Deque is empty, nothing to remove from back.");
                    }
                    break;
                case "5":
                    System.out.println("Elements in deque: " + deque);
                    break;
                case "6":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (!choice.equals("6"));

        scanner.close();
    }
}