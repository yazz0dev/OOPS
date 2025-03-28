// Binary search
import java.util.Scanner;

class bsearch{
    public static void main(String [] args)
    {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int x = sc.nextInt();
        bsearch ob1 = new bsearch();
        int result = ob1.binarySearch(arr,0,n-1,x);
        if(result == -1)
        {
            System.out.println("Element not present");
        }
        else
        {
            System.out.println("Element found at index "+result);
        }
    }
    int binarySearch(int arr[],int l,int r,int x)
    {
        if(r>=l)
        {
            int mid = l + (r-l)/2;
            if(arr[mid] == x)
            {
                return mid;
            }
            if(arr[mid] > x)
            {
                return binarySearch(arr,l,mid-1,x);
            }
            return binarySearch(arr,mid+1,r,x);
        }
        return -1;
    }
}