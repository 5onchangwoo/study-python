package sort;

public class SelectionSort {
    public static void sort(int[] arr) {
        sortWithLength(arr, arr.length);
    }
    private static void sortWithLength(int[] arr, int length) {
        for(int i = 0; i < length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < length; j++) {
                if(arr[minIndex] > arr[j]) minIndex = j;
            }
            Util.swap(arr, i, minIndex);
        }
    }
}
