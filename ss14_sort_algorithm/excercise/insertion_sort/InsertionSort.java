package ss14_sort_algorithm.excercise.insertion_sort;

public class InsertionSort {
    static int[] list = {-2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.print("list is element: ");
        for (int e : list) {
            System.out.print(e + "\t");
        }
    }
}
