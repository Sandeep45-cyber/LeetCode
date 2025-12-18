package BinarySearch;

public class SplitArray {
    static void main(String[] args) {

        int[] arr = {7, 2, 5, 8, 10};
        int m = 2;
        System.out.println(splitArray(arr, m));
    }

    static int splitArray(int[]nums, int m){

        int start = 0;
        int end = 0;

        for (int i : nums) {
            start = Math.max(start, i);
            end = end + i;
        }

        while(start < end){
            int mid = start + (end - start)/2;

            int sum = 0;
            int pieces = 1;

            for(int num: nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces <= m){
                end = mid;
            }else{
                start = mid + 1;
            }

        }

        return start;

    }
}
