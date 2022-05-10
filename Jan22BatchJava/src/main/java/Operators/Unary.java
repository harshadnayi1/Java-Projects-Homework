package Operators;

public class Unary {

    public static void main(String[] args) {
        int A=10;
        boolean B=true;

        System.out.println(A++);// 11, 10
        System.out.println(++A);// 11, 12
        System.out.println(A--); // 9, 11
        System.out.println(--A); // -9,9 , -10 ,-11
        System.out.println(!B); // false
    }
}
