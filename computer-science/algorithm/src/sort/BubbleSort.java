package sort;


public class BubbleSort {

    public static void sort (int[] arr) {
        sortWithLength(arr, arr.length);
    }
    private static void sortWithLength(int[] arr, int length) {
        for(int i = 0; i < length; i++) {
            for(int j = 0 ; j < length; j++) {
                if(arr[i] < arr[j]) Util.swap(arr, i, j);
            }
        }
    }

}
