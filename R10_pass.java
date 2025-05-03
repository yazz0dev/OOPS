import java.util.Scanner;

// 1. Define the custom user-defined exception class
class AuthenticationException extends Exception {
    // Constructor that accepts an error message
    public AuthenticationException(String message) {
        // Call the superclass (Exception) constructor to store the message
        super(message);
    }
}

// Main class to perform authentication
class R12_pass {
    // Hardcoded valid username and password (for demonstration)
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "admin123";

    // Method to authenticate user credentials
    public static void authenticate(String username, String password) throws AuthenticationException {
        // Check if the provided username and password match the valid ones
        if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {
            System.out.println("Authentication successful! Welcome, " + username + ".");
        } else {
            // If authentication fails, throw the custom exception
            throw new AuthenticationException("Authentication failed! Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username, password;

        System.out.println("--- Login ---");
        System.out.print("Enter username: ");
        username = sc.next(); // Reads the next token (word)

        System.out.print("Enter password: ");
        password = sc.next(); // Reads the next token (word)

        try {
            // Call the authentication method which might throw the exception
            authenticate(username, password);

        } catch (AuthenticationException e) {
            // Catch the specific custom exception if authentication fails
            System.err.println("Error: " + e.getMessage()); // Print the error message from the exception

        } finally {
            // This block always executes, whether an exception occurred or not
            System.out.println("Closing resources.");
            sc.close(); // Close the scanner to release system resources
        }

        System.out.println("Program finished.");
    }
}