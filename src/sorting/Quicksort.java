package sorting;

public class Quicksort {

    public static void main(String[] args) {

        int[] array = {7, 3, 2, 8, 5, 9, 4, 1};


        quicksort(array,0,array[array.length-1]);

    }

    public static void quicksort(int array[], int low, int high){

        int pivot = array[array.length-1];

        if(array.length==0 || array.length==1)
            return;

        for (int i: array) {
            if(i<pivot)
                i++;


        }

        System.out.println(pivot);

    }
}
