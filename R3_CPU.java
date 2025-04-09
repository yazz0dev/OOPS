// computer(ram, no.of core,processor manaufacturer, price)

import java.util.Scanner;

public class Comp {
    public static void main(String [] args) {
        Cpu cpu = new Cpu();
        Cpu.Processor processor = cpu.new Processor();
        Cpu.Ram ram = new Cpu.Ram();
        Scanner sc = new Scanner(System.in);

        System.out.print("--Cpu--\nEnter the price: ");
        cpu.price = sc.nextInt();
        System.out.print("Enter the number of cores: ");
        processor.no_cores = sc.nextInt();
        System.out.print("Enter the Processor manufacturer: ");
        processor.manufacturer = sc.next();
        System.out.print("\n--Ram--\nEnter the memory size: ");
        ram.memory = sc.nextInt();
        System.out.print("Enter the manufacturer: ");
        ram.manufacturer = sc.next();
        
        System.out.println("\n***Computer Details***");
        processor.display();
        cpu.display();
        ram.display();
    }
}

class Cpu {
    int price;
    class Processor {
        int no_cores;
        String manufacturer;
         
        void display() {
            System.out.println("\n--Processor--");
            System.out.println("Cores: "+no_cores);
            System.out.println("Manufacturer: "+manufacturer);
        }
    }
    void display() {
        System.out.println("Price: "+price);
    }

    static class Ram {
    int memory;
    String manufacturer;
     
    void display() {
        System.out.println("\n--Ram--");
        System.out.println("Memory: "+memory);
        System.out.println("Manufacturer: "+manufacturer);
    }
}
}


   