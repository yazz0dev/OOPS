import java.util.Scanner;
import java.util.Arrays;

class Stringsrt
{
    static void udf(String arr[],int length)
    {
        int i,j;
        for(i=0;i<length;i++)
        {
            for(j=i+1;j<length;j++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        String[] arr = new String[0];
        int len = 0,i;
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("1. Insert to array\n2. user defined sort\t3. inbuilt sort");
            System.out.println("4. Exit");
            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1: System.out.print("Enter the no.of strings: ");
                        len = sc.nextInt();
                        arr = new String[len];

                        System.out.print("Enter the strings: ");
                        for(i=0;i<len;i++)
                        arr[i] = sc.next();
                        break;
                case 2: udf(arr,len);
                        System.out.println("\n"+Arrays.toString(arr)+"\n");
                        break;
                
                case 3: Arrays.sort(arr);
                        System.out.println("\n"+Arrays.toString(arr)+"\n");
                        break;
                
                case 4: System.exit(0);
                
                default: System.out.println("Invalid choice");
                
            }
        }
    }
}

