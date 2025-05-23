import java.util.Scanner;

public class Main {
    /* 
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


        Student std1= new Student();
        std1.setValue("Nahiyan",570, 3.8f);
        std1.display();
        float cgpa = std1.getCGPA();
        System.out.println(std1.getCGPA());
        System.out.println("\n");


        Student std2= new Student();
        std2.name= "Supti";
        std2.id = 27;
        std2.cgpa= 3.6f;
        std2.display();

        }
        */

/* 
        public static void main (String[] args){

        Teacher t1= new Teacher();
        t1.setValue("Nahiyan",57000);
        t1.display();

    
        }
}
*/
public static void main (String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter the size of the array:");
int size = input.nextInt();
int[]arr = new int [size];

System.out.println("Enter the values of the array:");
for(int i =0;i<size;i++)
{
    arr[i]=input.nextInt();
}
int sum = 0;

for(int i=0;i<size;i++)
{
    sum += arr[i];

}

System.out.println("The values are:" +  sum);

   }

}