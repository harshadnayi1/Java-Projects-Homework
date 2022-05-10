package Methods;

public class MethodOverloading {
    static int plusMethod(int x, int y){
     return x+y;
    }
    static double plusMethod(double x, double y){
       return x+y;
    }
    public static void main(String[] args) {
       int a =plusMethod(10,20);
      double b = plusMethod(10.20,10.20);

        System.out.println("Int:" +a);
        System.out.println("Double:" +b);
    }
}
