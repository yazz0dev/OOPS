// Binary search (Non-Recursive)
import java.util.Scanner;

class bsearch {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements (in sorted order):"); 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Ensure array is sorted.

        System.out.println("Enter the element to search:");
        int x = sc.nextInt();
        bsearch ob1 = new bsearch();
        int result = ob1.binarySearch(arr, x, n);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    int binarySearch(int arr[], int x, int n) { 
        int l = 0;
        int r = n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2; // To prevent potential overflow
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                l = mid + 1; // Search right half
            } else {
                r = mid - 1; // Search left half
            }
        }
        return -1; // Element not found
    }
}