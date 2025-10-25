public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {32, 53, 3, 23, 34};
        int target = 33;
        System.out.println();
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for(int index = start; index <= end; index++){
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will execute if none of the return statement is called
        // hence the target not found
        return -1;
    }
}