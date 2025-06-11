import java.util.Scanner;

class AuthenticationException extends Exception {
    public AuthenticationException(String msg) { 
        super(msg);
    }
}

class R10_pass {
    private static final String USER = "admin", PASS = "admin123";
    public static void authenticate(String u, String p) throws AuthenticationException {
        if (USER.equals(u) && PASS.equals(p))
            System.out.println("Authentication successful! Welcome, " + u + ".");
        else
            throw new AuthenticationException("Authentication failed! Invalid username or password.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String u = sc.next();
        System.out.print("Password: ");
        String p = sc.next();
        try {
            authenticate(u, p);
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
