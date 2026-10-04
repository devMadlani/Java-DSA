import java.util.Arrays;
// LeetCode : 2149
public class RearrangeElementsBySign {
    static int[] rearrangeArray(int[] arr) {
        int positiveIdx = 0;
        int negativeIdx = 1;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result[positiveIdx] = arr[i];
                positiveIdx += 2;
            } else {
                result[negativeIdx] = arr[i];
                negativeIdx += 2;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
}
