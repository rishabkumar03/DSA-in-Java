package Leetcode.binarySearchInte;
// https://leetcode.com/problems/split-array-largest-sum/description/
public class lc410 {
    public static void main(String[] args) {
        
    }

    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i=0; i<nums.length; i++) {

            // in the end of the loop this will contain the max item from the array
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        // binary search
        while (start < end) {

            // try for the middle as potential ans
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in which this max sum
            int sum = 0;
            int pieces = 1;

            for (int num: nums) {
                if (sum + num > mid) {

                    // you can't add this in the subarray, make new one
                    // say you add this in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        // here, start == end
        return end; 
    }
}
