package Constructors;

public class Const {
    int a; //Class attribute
    //Create a class constructor for the main class
    public Const(){
        a=5; //set the initial value for the class attribute
    }
    public static void main(String[] args) {
        Const myObj = new Const(); //create an object of class Const (This will call the constructor)
        System.out.println(myObj.a);
    }
}
