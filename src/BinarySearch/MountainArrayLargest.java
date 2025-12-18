package BinarySearch;

public class MountainArrayLargest {
    static void main(String[] args) {
        int[] arr = { 1, 13, 15, 19, 21, 33, 22, 18, 7};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){

            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1]) // we are in the desc part of the array --- meaning we will set end = mid because
                // THIS may be the possible answer and we have to look for the left elements as well (may be bigger)
            {
                end = mid;
            }

            else{
                start = mid + 1; // THIS is becasue we are in the ASC part of the array and we want to look for the highest element/
                //and we would be looking at the next best value AFTER mid element
            }



        }

        return start; // or we can return end as well because ULTIMATELY WE are searching for the highest element and
        // The above search will want to look for the BEST possible element and it would POINT to a SINGLE element in the end
    }
}
