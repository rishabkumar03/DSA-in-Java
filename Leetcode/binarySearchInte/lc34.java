package Leetcode.binarySearchInte;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class lc34 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 55, 55, 55, 55, 350};
        int target = 55;
        int[] ans = new lc34().searchRange(nums, target);
        System.out.println(java.util.Arrays.toString(ans));

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        // check for first occurence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this functions just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;

        // check for the first occurence if target first
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            
            // find the middle element
            // int mid = (start + end) / 2;     // might be possible that (start + end) exceeds the range of integer in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {

                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
