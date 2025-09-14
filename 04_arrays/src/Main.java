import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        String str = null;
        //  int num = null  // we can't cast null to primitive data types


        //declaration of arr. ros is getting defined in stack at compile time
        int[] ros;
        // initialization: actually here object is being created in memory (heap) at run time
        ros = new int[5];


//        for (int i = 0; i < ros.length; i++) {
//            ros[i] = i;
//        }
//        for(int num : ros){ //for each
//            System.out.print(num + " ");
//        }
//        System.out.println(Arrays.toString(ros));

        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }
        System.out.println(Arrays.toString(arr));
    }

}
