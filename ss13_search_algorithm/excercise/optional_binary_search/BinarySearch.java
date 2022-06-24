package ss13_search_algorithm.excercise.optional_binary_search;

import java.util.Scanner;

public class BinarySearch {
    public int binarySearch(int[] arr, int x, int low, int high) {
        if (high >= low) {
            int mid = (high + low) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, x, low, mid - 1);
            } else {
                return binarySearch(arr, x, mid + 1, high);
            }

        }
        return -1;
    }
}