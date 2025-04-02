import java.util.Scanner;
import java.util.Arrays;

class linsrch{
    void search(int arr[], int n, int key){
        int i;
        for(i=0; i<n; i++){
            if(arr[i] == key){
                System.out.println("Element found at position " + (i+1));
                return;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args){
        int n, index=-1, key, i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(i=0; i<n; i++)
            arr[i] = sc.nextInt();        

        System.out.println("Enter the element to be searched: ");
        key = sc.nextInt();
        linsrch obj = new linsrch();
        obj.search(arr, n, key);
    }
}  
    
