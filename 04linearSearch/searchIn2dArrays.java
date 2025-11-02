import java.util.Arrays;

public class searchIn2dArrays {
    public static void main(String[] args) {
        int[][] arr = {
            {3, 432, 52, 72, 2},
            {24, 56, 26, 67, 2}, 
            {27, 7, 2, 7, 2, 24},
            {14, 64}
        };
        int target = 24;
        int[] ans = search(arr, target); //format of return value {row, col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
