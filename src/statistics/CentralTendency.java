package statistics;


import sorting.Bubblesort;
import sorting.Quicksort;

import java.util.Arrays;

public class CentralTendency {

    public static void main(String[] args) {

         int[] array = { 1,3,5,6,21,412,31,21,321,31,32132,2,2,112,21,12,2,1,122,21};

        Quicksort.quicksort(array,0,array.length-1);

        System.out.println(Arrays.toString(array));

        System.out.println(findMean(array));

    }

    public static double findMean(int[] array){

        int sum = 0;

        for(int i=0; i<array.length;i++){
            sum+=array[i];
        }

        double mean = sum / array.length-1;

        return mean;
    }

}
