package BinarySearch;

public class SearchInMountain {
    static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 5, 1};

        int target = 5;

        System.out.println(search(arr, target));



    }

    //return the index of the element we want to find
    static int search(int[] arr, int target)
    {
        int peak = searchingInMountain(arr);
        int firstHalf = agnosticBS(arr, target, 0, peak);
        if(firstHalf != -1){
            return firstHalf;
        }
        return agnosticBS(arr, target, peak + 1, arr.length-1);


    }

    static int searchingInMountain(int[] arr){
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

        return start;
    }


    static int agnosticBS(int[]arr, int target, int start, int end){

        boolean isAsc = arr[start] < arr[end];

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(target == arr[mid])
                return mid;

            if(isAsc)
            {
                if(target < arr[mid])
                {
                    end = mid -1;
                }
                else if(target > arr[mid]){
                    start  = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
