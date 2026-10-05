public class ConsecutiveOnes {
    static int consecutiveOnes (int[] arr) {
        int currentCount = 0;
        int maxCount = 0;
        for(int num: arr){
            if(num == 1){
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,0,1,1,1};
        System.out.println(consecutiveOnes(arr));
    }

}
