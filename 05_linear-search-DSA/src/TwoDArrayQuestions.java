public class TwoDArrayQuestions {
    public static void main(String[] args) {
        int [][] arr = {
                {23,1,4},
                {2131,44,32,1,25},
                {18,12}
        };
        int target = 44;
//        boolean ans = searchIn2DArray(arr, target);
        int ans = maxIn2DArray(arr, target);
        System.out.println(ans);
    }

    static boolean searchIn2DArray(int[][] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target == arr[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
    static int maxIn2DArray(int[][] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0][0];

        for (int[] row : arr) {
            for (int element : row) {
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }

}
