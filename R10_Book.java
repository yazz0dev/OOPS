//8.Write a program that has class Publisher, Book, Literature and Fiction.
// Read the information and print the details of books from either the category, 
// using inheritance.

import java.util.Scanner;

class Book {
    String publisher;
    String title;
    int price;
    String author;
    
    void display() {
        System.out.println("Publisher: " + publisher);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Author: " + author);
    }
}
class Literature extends Book {
    String genre;
    void display() {
        super.display();
        System.out.println("Genre: " + genre);
    }
}
class Fiction extends Book {
    String genre;
    void display() {
        super.display();
        System.out.println("Genre: " + genre);
    }
}
public class R10_Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String publisher, title, author, genre;
        int price;
        do {
            System.out.println("Enter 1 for Literature, 2 for Fiction, 3 to exit:");
            choice = sc.nextInt();
            if(choice == 3) {
                System.out.println("Exiting...");
                System.exit(0);
            }
            System.out.print("Enter Publisher: ");
            publisher = sc.next();
            System.out.print("Enter Title: ");
            title = sc.next();
            System.out.print("Enter Price: ");
            price = sc.nextInt();
            System.out.print("Enter Author: ");
            author = sc.next();
            System.out.print("Enter Genre: ");
            genre = sc.next();
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
    }while (true);
    }
}
