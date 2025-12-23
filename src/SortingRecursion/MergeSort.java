package SortingRecursion;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {10, 8, 5, 3, 1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    
    }

    static int[] mergeSort(int[] arr){
        int mid = arr.length/2;

        if(arr.length == 1)
            return arr;


        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }


    static int[] merge(int[] first, int[] second){

        int i = 0;
        int j = 0;
        int k = 0;

        int[] max = new int[first.length + second.length];

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                max[k] = first[i];
                i++;
            }else{
                max[k] = second[j];
                j++;
            }
            k++;
        }

        //if any of the array is finished and there are remaining elements
        while(i < first.length){
            max[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            max[k] = second[j];
            j++;
            k++;
        }

        return max;

    }
    
}
