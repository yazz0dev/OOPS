import java.util.Scanner;

 class Product
{
    int pcode,price;
    String name;
    Product(int pcode, String name, int price){
        this.pcode=pcode;
        this.name=name;
        this.price=price;
    }
}

public class Prodt
{
    public static void main(String args[])
    {
      Product p1= new Product(1,"watch",1500);
      
      int pcode= 2;
      int price=15000;
      String pname="phone";

      Product p2= new Product(pcode,pname,price);

      Scanner sc= new Scanner(System.in);

      System.out.print("-Product 3 \nEnter product code: ");
      pcode=sc.nextInt();
    
      System.out.print("Enter product name: ");
      pname=sc.next();

      System.out.print("Enter product price: ");
      price=sc.nextInt();

      Product p3= new Product(pcode,pname,price);
      System.out.println("\n\t  product code \t name \t price");

      System.out.println("product 1: \t "+p1.pcode+"\t "+p1.name+"\t"+p1.price);
      System.out.println("product 2: \t "+p2.pcode+"\t "+p2.name+"\t"+p2.price);
      System.out.println("product 3: \t "+p3.pcode+"\t "+p3.name+"\t"+p3.price+"\n");
      
      if(p1.price < p2.price && p1.price < p3.price)
      System.out.println("product 1 has lower price: "+p1.price);
      else if(p2.price < p3.price)
      System.out.println("product 2 has lower price: "+p2.price);
      else
      System.out.println("product 3 has lower price: "+p3.price);
    }
}