import java.util.Scanner;

public class Matrix {
    Scanner sc;
    int r;
    int c;
    int mx[][];

    void add(Matrix m1, Matrix m2) {
        if (m1.r != m2.r || m1.c != m2.c) {
            System.out.println("Can't add: different sizes.");
            System.exit(0);
        }
        r = m1.r;
        c = m1.c;
        mx = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mx[i][j] = m1.mx[i][j] + m2.mx[i][j];
    }

    void display() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(mx[i][j] + " ");
            System.out.println();
        }
    }

    void read() {
        sc = new Scanner(System.in);
        System.out.print("Rows: ");
        r = sc.nextInt();
        System.out.print("Cols: ");
        c = sc.nextInt();
        mx = new int[r][c];
        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mx[i][j] = sc.nextInt();
    }

    public static void main(String args[]) {
        Matrix m1 = new Matrix(), m2 = new Matrix(), m3 = new Matrix();
        System.out.println("enter Matrix 1:");
        m1.read();
        System.out.println("Enter Matrix 2:");
        m2.read();
        System.out.println("Matrix 1:");
        m1.display();
        System.out.println("Matrix 2:");
        m2.display();
        m3.add(m1, m2);
        System.out.println("Matrix 1 + Matrix 2:");
        m3.display();
    }
}
