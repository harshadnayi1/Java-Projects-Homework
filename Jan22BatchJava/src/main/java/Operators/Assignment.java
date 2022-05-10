package Operators;

public class Assignment {
    public static void main(String[] args) {
        int A=10;
        int B=20;
        int C;
        System.out.println(C=A); //10
        System.out.println(B);
        System.out.println(B+=A); //  B=B+A ->30
        System.out.println(B);
        System.out.println(B-=A);// B=B-A -> 10, -10, 0,20
        System.out.println(B);
        System.out.println(B*=A);// B=B*A ->200
        System.out.println(B);
        System.out.println(B/=A);//B= B/A ->0,2,20,22
        System.out.println(B);
        System.out.println(B^=A);//B= B^A -> 0,2,30
    }
}
