public class OddEven {
    public static void main(String[] args) {
        System.out.println("Even Numbers are: ");
        for (int i = 1; i<=100; i++) {
            if (i % 2 == 0) System.out.print(i + ", ");
        }
            System.out.println("\n\nOdd numbers: ");
            for (int i=1; i<=100; i++){
                if (i%2!=0) System.out.print(i+ ", ");

        }
    }
}
