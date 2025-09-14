public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {3,2,1,6,43,21,14,23};
        int target = 21;
        int start =  2;
        int end = 5;
        boolean ans = searchInRange(arr,target,start,end);
        System.out.println(ans);


    }
    static boolean searchInRange(int[] arr,int target, int start, int end){
        if(arr.length == 0) {
            return false;
        }
        for (int i = start; i <= end; i++) {
            if(target == arr[i]){
                return true;
            }
        }
        return false;
    }
}
