//12.Define 2 classes; one for generating multiplication table of 5 and other for displaying first N prime numbers.
// Implement using threads.(Thread class) 

class MultiplicationTable extends Thread {
    public void run() {
       System.out.println("\nMultiplication Table of 5:");
        for (int i = 1; i <= 10; i++)
            System.out.println("5 x " + i + " = " + (5 * i));
       }
}
class PrimeNumbers extends Thread {
    int n;
    PrimeNumbers(int n) { this.n = n; }
    public void run() {
        System.out.println("\nFirst [N:" + n + "] prime numbers:");
        int count = 0, num = 2;
        while (count < n) {
            boolean prime = true;
            for (int i = 2; i * i <= num; i++)
                if (num % i == 0) { prime = false; break; }
            if (prime) { System.out.print(num + " "); count++; }
            num++;
        }
        System.out.println();
    }
}
public class sample {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter Number N: ");
        int n = sc.nextInt();

        PrimeNumbers primeThread = new PrimeNumbers(n);
        MultiplicationTable tableThread = new MultiplicationTable();

        primeThread.start();
        try { primeThread.join(); } catch (InterruptedException e) {}

        tableThread.start();
        try { tableThread.join(); } catch (InterruptedException e) {}

        sc.close();
    }
}
