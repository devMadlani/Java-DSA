import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeElementsBySign_II {
    static int[] rearrangeArray(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int num : arr){
            if(num >0){
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        if(pos.size() > neg.size()){
            for (int i = 0; i < neg.size(); i++) {
                arr[i*2] = pos.get(i);
                arr[i*2+1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                arr[index] = pos.get(i);
                index++;
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                arr[i*2] = pos.get(i);
                arr[i*2+1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr[index] = neg.get(i);
                index++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,1,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
}
