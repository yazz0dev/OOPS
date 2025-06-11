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
public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Literature 2.Fiction 3.Exit");
            int choice = sc.nextInt();
            if (choice == 3) break;
            Book b = (choice == 1) ? new Literature() : new Fiction();
            System.out.print("Publisher: "); 
            b.publisher = sc.next();
            System.out.print("Title: "); 
            b.title = sc.next();
            System.out.print("Price: "); 
            b.price = sc.nextInt();
            System.out.print("Author: "); 
            b.author = sc.next();
            System.out.print("Genre: ");
            if (b instanceof Literature) ((Literature) b).genre = sc.next();
            else if (b instanceof Fiction) ((Fiction) b).genre = sc.next();
            System.out.println(choice == 1 ? "\n***Literature Book Details***" : "\n***Fiction Book Details***");
            b.display();
        }
        sc.close();
    }
}
