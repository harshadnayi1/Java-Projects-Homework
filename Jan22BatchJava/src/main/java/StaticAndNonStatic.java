public class StaticAndNonStatic {
    String name;
    static int sal;

    public static void main(String[] args) {
        sal =2500;
        System.out.println(sal);
        StaticAndNonStatic OBJ = new StaticAndNonStatic();

        System.out.println( OBJ.name = "Tester");


    }
}
