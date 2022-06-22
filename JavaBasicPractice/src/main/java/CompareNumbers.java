import java.util.Scanner;

public class CompareNumbers {
    public static void main( String args[] )
    {
        // create Scanner to obtain input from command window
     //   Scanner input = new Scanner(System.in);
        int number1 = 30; // first number to compare
        int number2 = 30; // second number to compare

        System.out.println( "Input first integer: "+ number1 ); // prompt
       // number1 = input.nextInt(); // read first number from user

        System.out.println( "Input second integer: " +number2); // prompt
       // number2 = input.nextInt(); // read second number from user

        if ( number1 == number2 )
            System.out.printf( "%d == %d\n", number1, number2 );
        if ( number1 != number2 )
            System.out.printf( "%d != %d\n", number1, number2 );
        if ( number1 < number2 )
            System.out.printf( "%d < %d\n", number1, number2 );
        if ( number1 > number2 )
            System.out.printf( "%d > %d\n", number1, number2 );
        if ( number1 <= number2 )
            System.out.printf( "%d <= %d\n", number1, number2 );
        if ( number1 >= number2 )
            System.out.printf( "%d >= %d\n", number1, number2 );
    }
}
