//16.Write a program to write to a file, then read from the file and display the contents on the console

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder content = new StringBuilder();

        // Collect input
        System.out.println("Enter text (type 'exit' to finish):");
        String input;
        while (!(input = sc.nextLine()).trim().equals("exit")) {
            content.append(input).append(System.lineSeparator());
        }
        
        // Write all content to file at once
        try (FileWriter writer = new FileWriter("out.txt")) {
            writer.write(content.toString());
        } catch (IOException e) {
            System.err.println("Write error: " + e);
        }
        
        // Read file
        try (Scanner fileScanner = new Scanner(new File("out.txt"))) {
            System.out.println("\nFile contents:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (IOException e) {
            System.err.println("Read error: " + e);
        }

        sc.close();
    }
}
