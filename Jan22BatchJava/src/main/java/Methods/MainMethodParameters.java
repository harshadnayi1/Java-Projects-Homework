package Methods;

public class MainMethodParameters {
    static void myMethod1(String fname, int age){

        System.out.println(fname+ " is " +age);
    }
    public static void main(String[] args) {
        myMethod1("Tester",21);
        myMethod1("Test",22);
        myMethod1("Dev",23);
    }

}
