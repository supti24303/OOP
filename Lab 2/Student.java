import java.util.Scanner;
public class Student{

    String name;
    int id;
    float cgpa;

    void display ()
    {
        System.out.println("Name is "+ this.name + "\nID is " + this.id + "\nCgpa is " + this.cgpa);
    }

    void setValue (String name, int id, float cgpa)
    {
        this.name= name;
        this.id= id;
        this.cgpa= cgpa;
    }
    float getCgpa()
    {
        return this.cgpa;
    }

        public static void main (String[] args){

            Scanner sc = new Scanner(System.in);
        Student std3= new Student();
        System.out.println("Enter you name: ");
        std3.name = sc.next();
        System.out.println("Enter you id: ");
        std3.id = sc.nextInt();
        System.out.println("Enter you cgpa: ");
        std3.cgpa = sc.nextFloat();
        std3.display();
        System.out.println("\n");
            

            Student s1 =new Student();
            s1.setValue("Supti", 22,3.5f);
            s1.display();

            Student s2 =new Student();
            s2.name="Nahiyan";
            s2.id=20;
            s2.cgpa= 3.89f;
            System.out.println("\n");
            s2.display();
        }
          
    
}



