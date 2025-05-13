public class SumandAverage {

    static void myMethod(){
        System.out.println("Riza");
    }
        
    static void myMethod(String name){
        System.out.println(name);
    }
     
      
    static void myMethod(String fname, String lname){
        System.out.println(fname+ " " + lname);
    }
        
    
    static void myMethod(int age, int weight){
        System.out.println("my age is: "+ age);
        System.out.println("And my weight is: "+ weight);
    }


    public static void main (String[] args) {

        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int num : numbers) {
           if (num == 6 || num == 7) {
               continue;
           }
           else if (num == 9) {
               break;
           }
                   sum += num;

        }

        System.out.println("The Sumtotal is : " + sum);
      
        double average = (double) sum / numbers.length;
        System.out.println("Now the Average is : " + average);


        myMethod();
        myMethod("Nahiyan");
        myMethod("Nahiyan", "Rahman");
        myMethod(22, 48);

    }
}