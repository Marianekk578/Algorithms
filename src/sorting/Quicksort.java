package sorting;

import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {

        int[] array = {7, 3, 2, 8, 5, 9, 4, 1};

        int n = array.length;
        quicksort(array, 0, n - 1);
        System.out.println(Arrays.toString(array));

    }

    public static void quicksort(int array[], int low, int high) {

        if (low >= high) {
            return;
        }

        if (array.length <= 1 || array == null)
            return;

        int pivot = array[high];
        int border = low - 1;
        int i = low;

        while (i < high) {
            if (array[i] < pivot) {
                border++;
                if (border != i) {
                    swap(array, border, i);
                }
            }
            i++;
        }

        border++;
        if (border != high) {
            swap(array, border, high);
        }

        quicksort(array, low, border - 1);
        quicksort(array, border + 1, high);
    }

    public static void swap(int[] array, int firstElement, int secondElement) {
        int temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }
}
