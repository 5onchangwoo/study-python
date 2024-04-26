package sort;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] testArr = getReverseOrderArray(10000);

        System.out.println(Arrays.toString(testArr));
        System.out.println("===버블 정렬===");
        long startTime = System.currentTimeMillis();
        BubbleSort.sort(testArr);
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(testArr));
        System.out.println("버블 정렬 " + (endTime - startTime) + "ms 걸림");

        System.out.println("===선택 정렬===");
        startTime = System.currentTimeMillis();
        SelectionSort.sort(testArr);
        endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(testArr));
        System.out.println("선택 정렬 " + (endTime - startTime) + "ms 걸림");

        System.out.println("===삽입 정렬===");
        startTime = System.currentTimeMillis();
        InsertionSort.sort(testArr);
        endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(testArr));
        System.out.println("삽입 정렬 " + (endTime - startTime) + "ms 걸림");


    }
    private static int[] getReverseOrderArray(int size){
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = size - i;
        }
        return arr;
    }

    private static int[] getRandomArray(int size) {
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
