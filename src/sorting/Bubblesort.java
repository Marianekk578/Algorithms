package sorting;

import java.util.Arrays;

public class Bubblesort {

    public static void main(String[] args) {

        int[] array = {4,7,2,5,1,3};

        bubblesort(array);

        System.out.println(Arrays.toString(array));

    }

    public static void bubblesort(int[] array){

        int n = array.length;

        for(int i=0;i<n-1;i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1])
                    swap(array[j+1], array[j]);
            }
        }
    }

    public static void swap(int first, int second){
        int temp = first;
        first = second;
        second = temp;
    }

}
