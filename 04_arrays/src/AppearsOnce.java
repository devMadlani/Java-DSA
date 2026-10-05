public class AppearsOnce {
    static int appearsOnce (int[] arr) {
        int xor = 0;
        for(int num : arr){
            xor ^= num;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,3,4,6,2};
        System.out.println(appearsOnce(arr));
    }
}
