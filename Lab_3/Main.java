package Lab_3;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        Employee emp1 = new Employee();
        Employee.Company_name = "Google";
        emp1.inserValue("Abdullah Al Aman", 570000);

        /*
         * System.out.println("Enter the Company: ");
         * emp.Complany_name = input.nextLine();
         * System.out.println("Enter the Employee's Name: ");
         * emp.name = input.nextLine();
         * System.out.println("Enter  Salary: ");
         * emp.Salary = input.nextFloat();
         */

        emp1.display();

        Employee emp2 = new Employee();
        Employee emp3 = new Employee("Nahiyan Rahman", 56000);
        Employee emp4 = new Employee("Supti Saha");
    }
}
