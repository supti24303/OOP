public class Teacher {
    
    String name;
     int sal;


void display(){

        System.out.println("The name of the teacher is: " + this.name);
        System.out.println("The sallery of the teacher is: " + this.sal);
}
        

    void setValue(String name, int sal){

        this.name = name;
        this.sal = sal;
    }

public static void main (String[] args){
    Teacher t1= new Teacher();
        t1.setValue("Supti",88000);
        t1.display();
}
        
}
