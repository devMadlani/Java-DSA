import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    static int removeDuplicates(int[] arr) {
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 3, 5, 6};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}
