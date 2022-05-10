package Operators;

public class Logical {
    public static void main(String[] args) {
        int A=10;
        int B=20;

        System.out.println(A<10 && B<20);// false
        System.out.println(A<10 || B<20);// false
        System.out.println (!(A<10 || B<21)); // false

    }
}
