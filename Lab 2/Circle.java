import java.util.Scanner;
public class Circle {
    double pi = 3.14;
    double rad; 
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        double rad = sc.nextDouble();

        Double Area = 3.14 * rad * rad;

        System.out.println("The area is: "+ Area);

    }
    
}