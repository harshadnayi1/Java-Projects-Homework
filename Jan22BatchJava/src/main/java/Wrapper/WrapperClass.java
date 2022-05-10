package Wrapper;

import java.util.ArrayList;

public class WrapperClass {

    public static void main(String[] args) {
        int  a= 10;

        Integer aa = new Integer(a);  //Boxing
        Integer bb = a;              // AutoBoxing

        int b = bb.intValue(); //UnBoxing
        int c = bb;            //AutoUnboxing

        //Use a wrapper class
        ArrayList <Integer> values = new ArrayList <Integer>();

        values.add(5);
        values.add(10);

    }
}
