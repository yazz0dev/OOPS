//12.Define 2 classes; one for generating multiplication table of 5 and other for displaying first N prime numbers.
// Implement using threads.(Thread class) 

import java.util.Scanner;
class MultiplicationTable extends Thread {
    public void run() {
        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}
class PrimeNumbers extends Thread {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        System.out.println("First " + n + " prime numbers:");
        int count = 0;
        int num = 2; // Start checking for prime from 2
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        scanner.close();
    }
}
public class R12_mul {
    public static void main(String[] args) {
        MultiplicationTable tableThread = new MultiplicationTable();
        PrimeNumbers primeThread = new PrimeNumbers();
        
        tableThread.start(); // Start the multiplication table thread
        primeThread.start(); // Start the prime numbers thread
    }
}