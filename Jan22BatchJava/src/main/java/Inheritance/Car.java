package Inheritance;

public class Car extends Vehicle {
    public void openCarDoor(){
        System.out.println("Car ------ Open the Door");
    }
    public void startEngine(){
        System.out.println("Car ------ Key Start");
    }
    public void drive(){
        System.out.println("Car ------ Accelerate");
    }
    public void stop(){
        System.out.println("Car ------ Stop");
    }
    public void lockDoor(){
        System.out.println("Car ------ Lock Door");
    }
}
