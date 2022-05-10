package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        try{
//        int i=9/0;
            int ar[] = {1,2,3,4,5};
            for (int i=0;i<=ar.length;i++){
                System.out.println(ar[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){

//            System.out.println("you can't divide by zero");
            System.out.println("Array size is not right");
        }
        int ar[] = {1,2,3,4,5};
        for (int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }

    }
}
