package Leetcode.linearSearchAlgo;

// https://leetcode.com/problems/richest-customer-wealth/description/
public class lc1672 {
    public static void main(String[] args) {
        int[][] person = {{1,20,3},{3,2,1}};
        System.out.println();
        System.out.println(maximumWealth(person));
    }

    public static int maximumWealth(int[][] accounts){
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] person : accounts){
            // when you start a new col, take a sum for that row 
            int sum = 0;
            for (int account : person) {
                sum += account;
            }

            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
