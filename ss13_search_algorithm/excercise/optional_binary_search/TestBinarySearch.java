package ss13_search_algorithm.excercise.optional_binary_search;

public class TestBinarySearch {
    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int x = 4;
        int high = arr.length;
        int result = search.binarySearch(arr, x, 0, high);
        System.out.println("kết quả : " + result);
    }
}
