//17.Client server communication using Socket-TCP/IP

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class R17 {
    public static void main(String[] args) {
        // Start the server
        new Thread(new Server()).start();

        // Start the client
        new Thread(new Client()).start();
    }
}

class Server implements Runnable {
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started. Waiting for client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Received from client: " + message);
                out.println("Echo: " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Client implements Runnable {
    public void run() {
        try (Socket socket = new Socket("localhost", 12345)) {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner scanner = new Scanner(System.in);

            String message;
            while (true) {
                System.out.print("Enter message to send to server (type 'exit' to quit): ");
                message = scanner.nextLine();
                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
                out.println(message);
                System.out.println("Server response: " + in.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}