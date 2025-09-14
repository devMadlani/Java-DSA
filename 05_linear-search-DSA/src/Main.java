import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {3,2,1,4,5,32,5,6,42};
        int target = in.nextInt();
        int result = linearSearch(arr, target);
        System.out.println(target + " is found at "+ result + " Index");

    }
    // search in the array: return the index if item found else return -1
    static int linearSearch (int[] arr,int target) {
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]) return i;
        }
        return -1;
    }
}
