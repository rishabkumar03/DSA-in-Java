public class maximum {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = {34, 4, 132, 64, 65};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        return maxVal;
    }
}
