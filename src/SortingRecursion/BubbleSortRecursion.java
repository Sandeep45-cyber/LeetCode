package SortingRecursion;

import java.util.Arrays;

public class BubbleSortRecursion {

    public static void main(String[] args) {

        int[] arr = {10, 9, 8};
        selection(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
        
    }
    static void bubble(int[] arr, int index, int arrLength){
        if(arrLength == 0){
            return;
        }
        if(arrLength > index){
        if(arr[index] > arr[index + 1]){
            swap(arr, index, index + 1);
        }
        bubble(arr, index + 1, arrLength);
    }
        else{
        bubble(arr, 0, arrLength - 1);}


    }

    static void swap(int[]arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    static void selection(int[] arr, int index, int arrLength){
        if(arrLength < 0){
            return;
        }
        // Find the maximum element in the range [0, arrLength]
        int maxIndex = maxValue(arr, 0, arrLength);
        // Swap the maximum element with the element at arrLength
        swap(arr, maxIndex, arrLength);
        // Recursively sort the remaining array [0, arrLength-1]
        selection(arr, 0, arrLength - 1);
    }


    static int maxValue(int[]arr, int start, int end){
        int maxIndex = start;
        // Find max index in the range [start, end]
        for(int index = start; index <= end; index++){
            if(arr[index] > arr[maxIndex])
                maxIndex = index;
        }
        return maxIndex;
    }
    
}
