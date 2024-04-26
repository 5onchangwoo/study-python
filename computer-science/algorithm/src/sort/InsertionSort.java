package sort;

public class InsertionSort {
    public static void sort(int[] arr){
        sort(arr, arr.length);
    }

    public static void sort(int[] arr, int length){
        for(int i = 0; i < length - 1; i++) {
            int j = i + 1;
            while(j >= 0 && arr[i] > arr[j]) {
                Util.swap(arr,i, j--);
            }
        }
    }
}
