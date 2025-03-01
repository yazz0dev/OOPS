import java.util.Scanner;

public class Matrix {
    Scanner sc;
    int r;
    int c;
    int mx[][];

    void add(Matrix m1, Matrix m2) {
        if (m1.r != m2.r || m1.c != m2.c) {
            System.out.println("Matrices have different dimensions and can't be added.");
            return;
        }
        this.r = m1.r;
        this.c = m1.c;
        this.mx = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mx[i][j] = m1.mx[i][j] + m2.mx[i][j];
            }
        }

        System.out.println("Matrix 3:");
    }

    void display() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mx[i][j] + " ");
            }
            System.out.println();
        }
    }

    void read() {
        sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        r = sc.nextInt();
        System.out.println("and columns:");
        c = sc.nextInt();
        mx = new int[r][c];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mx[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String args[]) {
        Matrix m1 = new Matrix();
        m1.read();
        Matrix m2 = new Matrix();
        m2.read();
        System.out.println("Matrix 1:");
        m1.display();
        System.out.println("Matrix 2:");
        m2.display();
        Matrix m3 = new Matrix();
        m3.add(m1, m2);
        m3.display();
    }
}
