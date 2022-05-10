public class Car {
    //Class Variables
    int mod;
    int wheel;

    public static void main(String[] args) {
    // new Car() -> this is the object of car class
    // new -> is used to create a object
    //a,b,c -> Object reference variable

        Car a = new Car();
        Car b = new Car();
        Car c = new Car();

        a.mod =2015;
        a.wheel =4;

        b.mod =2016;
        b.wheel=5;

        c.mod =2022;
        c.wheel =6;

        System.out.println(a.mod);
        System.out.println(a.wheel);

        System.out.println(b.mod);
        System.out.println(b.wheel);

        System.out.println(c.mod);
        System.out.println(c.wheel);

    }
}
