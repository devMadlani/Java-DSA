public class MissingNum {
    static int missingNum(int[] arr) {
        int xor = arr.length;
        for (int i = 0; i < arr.length; i++) {
            xor ^= i;
            xor ^= arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(missingNum(arr));
    }
}
