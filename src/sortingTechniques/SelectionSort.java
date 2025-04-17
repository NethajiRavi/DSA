package sortingTechniques;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr  = new int[]{1,5,0,-1,2,5};
        sortAnArrayBySelectionSort(arr);

    }

    private static int[] sortAnArrayBySelectionSort(int[] arr) {
        /*
        * sorting the array by one by one element
        * */

        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length;j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
              arr[i] =arr[min];
            arr[min] = temp;
        }
        return arr;
    }


}
