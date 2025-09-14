public class swap {
    public static void main(String[] args) {
        int[] arr = {1,3,2,15,6,7};
        swapValues(arr,1,3);
        System.out.println();
    }
    static void swapValues(int[] arr,int idx1,int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

}
