package Recursion;

public class BinarySearch {

    static void main(String[] args) {

        int[] arr = { 5, 62, 88, 91, 122};
        int ans = binarySearch(arr, 62, 0, arr.length - 1);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target, int start, int end){

        if(start >  end)
            return -1;

        int mid = start + (end - start)/2;

        if(target == arr[mid])
            return mid;

        if(target > arr[mid])
            return binarySearch(arr, target, mid + 1, end);
        else
            return binarySearch(arr, target, start, mid - 1);
    }
}
