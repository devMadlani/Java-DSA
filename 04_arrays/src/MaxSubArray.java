public class MaxSubArray {
    // Kadanes's algorithm
    static int maxSubArray(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : arr){
            sum += num;
            ans = Math.max(ans, sum);
            if(sum < 0) sum = 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, -2, 7, -4};
        System.out.println(maxSubArray(arr));
    }
}
