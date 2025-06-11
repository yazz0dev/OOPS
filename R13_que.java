//13.Write a program to demonstrate the addition and deletion of elements in deque.
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class R13_que {
    public static void main(String[] args) {
        // Create a Deque (double-ended queue) using ArrayDeque
        Deque<String> dq = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add front 2. Add back 3. Remove front 4. Remove back 5. Display 6. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    dq.addFirst(sc.next());
                    break;
                case 2:
                    System.out.print("Enter element: ");
                    dq.addLast(sc.next());
                    break;
                case 3:
                    System.out.println(dq.isEmpty() ? "Empty" : "Removed: " + dq.removeFirst());
                    break;
                case 4:
                    System.out.println(dq.isEmpty() ? "Empty" : "Removed: " + dq.removeLast());
                    break;
                case 5:
                    System.out.println("Deque: " + dq);
                    break;
            }
        } while (choice != 6);

        sc.close();
    }
}
