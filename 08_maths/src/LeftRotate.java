import java.util.Arrays;

public class LeftRotate {
    static void leftRotateOne(int[] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length- 1] = temp;
    }

    static void leftRotateNTimes(int[] arr, int k){

    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,16};
        leftRotateOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}
