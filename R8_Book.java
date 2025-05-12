import java.util.Scanner;

public class R8_Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String publisher, title, author, genre;
        int price;
        do {
            System.out.println("Enter 1 for Literature, 2 for Fiction, 3 to exit:");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline
            
            if(choice == 3) {
                System.out.println("Exiting...");
                System.exit(0);
            }
            
            System.out.print("Enter Publisher: ");
            publisher = sc.nextLine();
            
            System.out.print("Enter Title: ");
            title = sc.nextLine();
            
            System.out.print("Enter Price: ");
            price = sc.nextInt();
            sc.nextLine(); // Consume the newline
            
            System.out.print("Enter Author: ");
            author = sc.nextLine();
            
            System.out.print("Enter Genre: ");
            genre = sc.nextLine();
            
            if (choice == 1) {
                Literature lit = new Literature();
                lit.publisher = publisher;
                lit.title = title;
                lit.price = price;
                lit.author = author;
                lit.genre = genre;
                System.out.println("\n***Literature Book Details***");
                lit.display();
            } else if (choice == 2) {
                Fiction fic = new Fiction();
                fic.publisher = publisher;
                fic.title = title;
                fic.price = price;
                fic.author = author;
                fic.genre = genre;
                System.out.println("\n***Fiction Book Details***");
                fic.display();
            }   
        } while (true);
    }
}
