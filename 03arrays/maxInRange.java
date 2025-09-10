public class maxInRange {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = {34, 53, 532, 654, 24};
        System.out.println(maximumInRange(arr, 0, 2));
    }

    static int maximumInRange(int[] arr, int start, int end) {
        
        if (end > start) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int maxValue = arr[start];

        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        return maxValue;
    }
}
