import java.util.Scanner;

class Employee {
    int Empid;
    String Name;
    double Salary;
    String Address;


    Employee(int empid, String name, double salary, String address) {
        this.Empid = empid;
        this.Name = name;
        this.Salary = salary;
        this.Address = address;
    }

    void display() {
        System.out.println("Employee ID: " + Empid);
        System.out.println("Name: " + Name);
        System.out.println("Salary: " + Salary);
        System.out.println("Address: " + Address);
    }
}


class Teacher extends Employee {
    String department;
    String Subjects_taught;


    Teacher(int empid, String name, double salary, String address, String department, String subjects_taught) {
        super(empid, name, salary, address); 
        this.department = department;
        this.Subjects_taught = subjects_taught;
    }


    @Override
    void display() {
        super.display(); 
        System.out.println("Department: " + department);
        System.out.println("Subjects Taught: " + Subjects_taught);
        System.out.println("-------------------------");
    }
}

public class Teach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of teachers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");

            System.out.print("Employee ID: ");
            int empid = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Department: ");
            String department = scanner.nextLine();

            System.out.print("Subjects Taught: ");
            String subjects = scanner.nextLine();

            teachers[i] = new Teacher(empid, name, salary, address, department, subjects);
        }

        System.out.println("\n--- Teacher Details ---");
        for (Teacher teacher : teachers) {
            teacher.display();
        }

        scanner.close();
    }
}