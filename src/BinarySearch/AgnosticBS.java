package BinarySearch;

public class AgnosticBS {

    static void main(String[] args) {
        int[] arr = {90,80,70,60,50,40,10};

        System.out.println(agnosticBS(arr, 40));
    }

    static int agnosticBS(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
