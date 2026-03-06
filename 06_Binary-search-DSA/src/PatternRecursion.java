import java.util.Arrays;

public class PatternRecursion {

    public static void main(String[] args) {
        int[] arr = {5,1,4,2,3};
        pattern(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    static void pattern(int[] arr, int r, int c){
        if(r == arr.length - 1) return;
        if(c < arr.length && arr[c] < arr[c - 1]){

            int temp = arr[c];
            arr[c] = arr[c - 1];
            arr[c - 1] = temp;
            pattern(arr, r, c + 1);
        } else {
            pattern(arr,r+1, r+1);

        }
    }
}
