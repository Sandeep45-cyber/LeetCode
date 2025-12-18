package Sort;

import java.util.Arrays;

public class BubbleSort {

    static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[]arr){
        for(int i = 0; i < arr.length - 1; i++){
            //check for after and present element j and j -1
            for(int j = i + 1; j > 0; j--){
                if(arr[j] > arr[j-1]){
                    break;
                }else{
                    swap(arr, j, j-1);
                }
            }
        }
    }

    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = maxIndex(arr, 0,last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int maxIndex(int[] arr, int start, int end){
        int maxIndex = start;

        for(int i = 0; i <= end; i++){
            if(arr[maxIndex] < arr[i]){
                maxIndex = i;
            }


        }

        return maxIndex;
    }



    static void bubbleSort(int[]arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
