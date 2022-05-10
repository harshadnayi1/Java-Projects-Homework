package Array;

public class TwoDimensionalArray {

    public static void main(String[] args) {
//        int data[][] =new int[4][4];
//        data[0][0] = 5;
//        data[0][1] = 10;
//        data[0][2] = 15;
//        data[0][3] = 20;
//
//        data[1][0] = 25;
//        data[1][1] = 30;
//        data[1][2] = 35;
//        data[1][3] = 40;
//
//        data[2][0] = 45;
//        data[2][1] = 50;
//        data[2][2] = 55;
//        data[2][3] = 60;
//
//        data[3][0] = 65;
//        data[3][1] = 70;
//        data[3][2] = 75;
//        data[3][3] = 80;
//
////        System.out.println(data[2][2]);
//
//        for(int i=0;i<data.length;i++){
//            for(int j=0;j< data.length;j++){
//                System.out.print(data[i][j]+ " ");
//            }
//            System.out.println();
//        }

// Other way to write the program
        int arr[][] = {{5, 10, 15, 20}, {25, 30, 35, 40}, {45, 50, 55, 60}, {65, 70, 75, 80}};
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr.length; b++) {
                System.out.print(arr[a][b] + " ");
            }
            System.out.println();
        }
    }
}
