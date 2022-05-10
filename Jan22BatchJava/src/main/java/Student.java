/*
Step 1: Create the method
Step 2: Create the object
Step 3: Execute the method
 */
public class Student {

//    Non Static method
    void maths(){
        System.out.println("My Marks is 95");

    }

//    Static method
    static void english(){
        System.out.println("My Marks is 90");

    }

    public static void main(String[] args) {
        //Non Static method
        Student Sub = new Student();
        Sub.maths();

        //Static method
        english();

    }

}
