import java.util.Scanner;
import java.util.Arrays;


class Arraybs {
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the number of elements:");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers); 

        System.out.println("Sorted array: " + Arrays.toString(numbers));

        System.out.println("Enter the element to search for:");
        int target = sc.nextInt();

        int result = Arrays.binarySearch(numbers, target); 

        if (result >= 0) { 
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        // Good practice to close the scanner
        sc.close();
    }
}
