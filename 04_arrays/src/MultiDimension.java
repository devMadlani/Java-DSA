import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
        */
        int[][] arr = new int[3][3];  // []-fist is for row(mandatory)
                                     // []-second is for column(optional)

//        int[][]  arr = {
//                {1 ,2, 3},
//                {4 ,5, 6},
//                {7 ,8, 8},
//        };
        Scanner in = new Scanner(System.in);

        for (int row = 0; row < arr.length ; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
