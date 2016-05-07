package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array1; // array for sorting
        int[] array2; // the resulting array
        int max; // max value of 'array1'
    }

    public static int[] countingSort(int[] array, int[] sorted, int max){
        int[] tempArray = new int[max + 1];

        Arrays.fill(tempArray, 0);
        for (int i = 0; i < array.length; i++){
            tempArray[array[i]]++; // add new appearance of element
        }
        for (int i = 1; i < tempArray.length; i++) {
            tempArray[i] += tempArray[i - 1]; // number of elements that are not bigger than current
        }
        for (int i = array.length - 1; i >= 0; i--){
            sorted[tempArray[array[i]] - 1] = array[i];
            tempArray[array[i]]--;
        }
        return sorted;
    }
}
