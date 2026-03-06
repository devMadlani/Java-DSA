package recursion.subset_subseq;

import java.util.ArrayList;

public class SubsetOfString {
    static void main(String[] args) {
        subStr("","abc");
        System.out.println(subStrASCIIArrayList("", "abc"));
    }

    static void subStr(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subStr(p + ch, up.substring(1));
        subStr(p , up.substring(1));
    }

    static ArrayList<String> subStrArrayList(String p, String up){
        if(up.isEmpty()) {
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;


        }
        char ch = up.charAt(0);
        ArrayList<String> left = subStrArrayList(p + ch, up.substring(1));
        ArrayList<String> right = subStrArrayList(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    static ArrayList<String> subStrASCIIArrayList(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subStrASCIIArrayList(p + ch, up.substring(1));
        ArrayList<String> right = subStrASCIIArrayList(p, up.substring(1));
        ArrayList<String> ascii = subStrASCIIArrayList(p + (ch + 0), up.substring(1));
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
