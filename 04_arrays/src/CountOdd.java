public class CountOdd {
    static int countOdd(int[] arr) {
        int count = 0;
        for(int num : arr){
            if(num % 2 != 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(countOdd(arr));
    }
}
