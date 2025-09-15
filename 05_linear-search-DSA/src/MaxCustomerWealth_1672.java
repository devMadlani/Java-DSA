// https://leetcode.com/problems/richest-customer-wealth/description/

public class MaxCustomerWealth_1672 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,5},{3,2,1}};
        int RichestWealth = maximumWealth(arr);
        System.out.println(RichestWealth);
    }
    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] rows : accounts){
            int sum = 0;
            for(int account: rows){
                sum+=account;
            }
            if(sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
