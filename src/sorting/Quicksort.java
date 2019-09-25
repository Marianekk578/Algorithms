package sorting;

import java.util.Arrays;

/**
 * Quicksort Algorithm
 * by Marcin Wójcik
 */
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

        /** get the pivot element from the end */
        int pivot = array[high];
        int border = low - 1;
        int i = low;

        /** divide array into two groups, first one for elements smaller than pivot, second for higher */
        while (i < high) {
            if (array[i] < pivot) {
                border++;
                if (border != i) {
                    swap(array, border, i);
                }
            }
            i++;
        }

        /** getting pivot between two group */
        border++;
        if (border != high) {
            swap(array, border, high);
        }

        /** recursive operations for tow sub arrays */
        quicksort(array, low, border - 1);
        quicksort(array, border + 1, high);
    }

    public static void swap(int[] array, int firstElement, int secondElement) {
        int temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }
}
