package recursion;


//Given an integer num, return the number of steps to reduce it to zero.
//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

public class Q_1342_CountDigitsToZero {
    public static void main(String[] args) {
        System.out.println(countSteps(14,0));
    }
    static int countSteps(int n, int count){
        if(n == 0){
            return count;
        }
        if(n % 2 == 0) {
            count++;
            return countSteps(n / 2, count);
        }
         return countSteps(n - 1 , count+1);
    }
}
