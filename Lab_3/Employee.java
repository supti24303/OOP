package Lab_3;

public class Employee {

    public static String Company_name;
    public String name;
    public float Salary;

    void inserValue(String name, float sal) {

        this.name = name;
        this.Salary = sal;
    }

    void display() {

        System.out.println("The name of the Employee is: " + this.name);
        System.out.println("Employee's Salary: " + this.Salary);
    }

    public Employee() {
        System.out.println("Default Construction");
    }

    ///contruction
    public  Employee(String name, float Salary) {

        this.name = name;
        this.Salary = Salary;
        System.out.println("The name of the Employee is: " + this.name);
        System.out.println("Employee's Salary: " + this.Salary);
    }

    public Employee(String name) {

        this.name = name;
        System.out.println("The name of the Employee is: " + this.name);
    }

    /* 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Enter the Company: ");
        emp.Complany_name = input.nextLine();
        System.out.println("Enter the Employee's Name: ");
        emp.name = input.nextLine();
        System.out.println("Enter  Salary: ");
        emp.Salary = input.nextFloat();

        emp.display();

        Employee emp2 = new Employee();
        Employee emp3 = new Employee("Nahiyan Rahman", 56000);
        Employee emp4 = new Employee("Supti Saha");

    }
        */

}