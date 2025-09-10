import java.util.Arrays;

public class swaping{
    public static void main(String[] args) {
        int[] arr = {34, 3, 65, 7, 2};
        swap(arr, 0, 1);
        System.out.println("");
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}