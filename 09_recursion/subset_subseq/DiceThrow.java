import java.util.ArrayList;

public class DiceThrow {
    public static void main(String[] args) {
        System.out.println(diceThrow("",6
        ));
    }

    static ArrayList<String> diceThrow(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= target; i++){
            list.addAll(diceThrow(p+i, target - i));
        }
        return list;
    }
}
