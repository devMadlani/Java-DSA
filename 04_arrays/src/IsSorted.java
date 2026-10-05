public class IsSorted {
    static boolean isSorted(int[] arr){
        if(arr.length <= 1) return true;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,4,5,6,7,9};
        System.out.println(isSorted(arr));
    }
}
