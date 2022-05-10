package Array;

public class ArrayConcept {

//    int a =10;
//    int a =20;
//    int a =30;
//    int a =40;
//    int a =50;

    public static void main(String[] args) {
//        //Declare an array
//        int []a =new int[6];
////        a[0] =10;
////        a[1] =20;
////        a[2] =30;
////        a[3] =40;
////        a[4] =50;
////        System.out.println(a[2]);//Specific array
////        System.out.println(a.length);// need to find a length
////        System.out.println(a[1]+a[2]); //Add an array
////        System.out.println(a[3]+ " " +a[4]);//print two array
////        System.out.println(a[5]);// It will print the default value
//
//        //Print all values of the arrays
//        for (int i=0; i<a.length;i++){
//            System.out.println(a[i]);
//        }

//Class members String Array
//        String name[] = new String[5];
//        name[0] = "Tester1";
//        name[1] = "Tester2";
//        name[2] = "Tester3";
//        name[3] = "Tester4";
//        name[4] = "Tester5";
//
//        System.out.println(name[3]);
//
//        for(int j=0;j< name.length;j++){
//            System.out.println(name[j]);
//        }

//Object Array - to store different data types in one variable
//               pre-defined java class, it is the parent/super class of the classes

        Object StudD[] =new Object[5];
        StudD[0] = 1;
        StudD[1] = "Tester";
        StudD[2] = 'm';
        StudD[3] = 25.5f;
        StudD[4] = true;

        for (int k = 0; k<5;k++){
            System.out.println(StudD[k]);
        }

    }
}
