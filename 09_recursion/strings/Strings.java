package recursion.strings;

public class Strings {
    static void main(String[] args) {
//        String s = "bvccaccabda";
//        System.out.println(skip(s));

        String skipS = "dev";
        String up = "devmadldevanidev";
        System.out.println(skipString(up, skipS));
    }
    //Q1 - approach -1 with args p
    static  void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    //Q1-  approach - 2 with no args p
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'b'){
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }

    // Q2- skip a string

    static  String skipString(String up, String s){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith(s)){
            return skipString(up.substring(s.length()), s);
        } else {
            return up.charAt(0) + skipString(up.substring(1), s);
        }
    }
}
