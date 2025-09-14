public class SearchInString {
    public static void main(String[] args) {
        String name = "dadfasfasdfasdfsadfq";
        char target = 'q';
        System.out.println(search2(name,target));
    }
    static boolean search2(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(target == ch){
                return  true;
            }
        }
        return  false;
    }
    static boolean search(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return  true;
            }
        }
        return  false;
    }
}
