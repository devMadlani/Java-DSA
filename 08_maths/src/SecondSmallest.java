public class SecondSmallest {
    static int secondSmallest(int[] arr){
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest= arr[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,2,1,0,7, -1,-12};
        System.out.println(secondSmallest(arr));
    }
}
