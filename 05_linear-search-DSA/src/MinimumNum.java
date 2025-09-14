public class MinimumNum {
    public static void main(String[] args) {
        int[] arr = {31,-22,5,12,6,7};
        int minimum = findMinimum(arr);
        System.out.println(minimum);
    }

    static int findMinimum(int[] arr){
        int min = arr[0];
        for(int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
