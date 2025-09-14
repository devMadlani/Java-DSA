import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer>  list = new ArrayList<>(10);
        list.add(67);
        list.add(57);
        list.add(37);

        System.out.println(list.contains(37));
        System.out.println(list.set(2,100));
        list.remove(2);
        System.out.println(list);

//        for (int i = 0; i < 5; i++) {
//            list.add(in.nextInt());
//        }
//        System.out.println(list);

        // multidimensional ArrayList
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            multiList.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiList.get(i).add(in.nextInt());
            }
        }
        System.out.println(multiList);

    }
}
