public class findMin {
    public static void main(String[] args) {
        int[] arr = {1234, 3, 4, 12, 5, -32, 02};
        System.out.println();
        System.out.println(min(arr));
    }

    // assume arr.length != 0
    // return the minimum value in the array
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }   
        }
        return ans;
    }
}
