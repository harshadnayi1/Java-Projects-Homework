package ExceptionHandling;

public class Finally {
    public static void main(String[] args) {
        try {
            int myNumbers[] = {100, 20, 30};
        }
        catch(Exception e ) {
            System.out.println("Array out of size");
        }finally{
            System.out.println(100);
        }
    }


}
