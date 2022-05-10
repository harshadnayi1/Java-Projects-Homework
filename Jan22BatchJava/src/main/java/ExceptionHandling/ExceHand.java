package ExceptionHandling;

public class ExceHand {
    public static void main(String[] args) throws InterruptedException {
//        //uncaught exception
//        int i =9/0;
//        System.out.println(i);
//
//        //caught exception
        Thread.sleep(2000);

        int ar[] = {1,2,3,4,5};
        for (int i=0;i<=ar.length;i++){
            System.out.println(ar[i]);
        }
        int ar1[] = {1,2,3,4,5};
        for (int J=0;J<ar1.length;J++){
            System.out.println(ar1[J]);
        }
    }


}
