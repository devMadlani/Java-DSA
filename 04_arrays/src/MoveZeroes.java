import java.util.Arrays;

public class MoveZeroes {
    static void moveZeroes(int[] arr) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) return;
        for (int i = j + 1; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,2,4,0,5,6,0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
