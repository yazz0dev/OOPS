//16.Write a program to write to a file, then read from the file and display the contents on the console

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class R16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "output.txt";

        // Write to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Enter text to write to the file (type 'exit' to finish):");
            String input;
            while (true) {
                input = scanner.nextLine();
                if (input.trim().equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(input);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Read from the file and display contents on the console
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\nContents of the file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        scanner.close();
    }
}
