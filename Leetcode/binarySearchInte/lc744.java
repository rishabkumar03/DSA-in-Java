package Leetcode.binarySearchInte;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class lc744 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    } 

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0; 
        int end = letters.length - 1;

        while (start <= end) {

            // find the middle element
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}
