package Arrays;

public class RotatedArray {
    public static void main(String[] args) {

        int[] arr = {5, 6, 1, 2, 3, 4};
        int ans = rotatedArray(arr, 0, 0, arr.length -1);

        System.out.println(ans);
        
    }

    static int rotatedArray(int[] arr, int target, int start, int end){
        if( start > end)
            return -1;

        int mid = start + (end - start)/2;

        if(target == arr[mid])
                return mid;
        if(arr[start] <= arr[mid])
        {

            if(target >= arr[start] && target <= arr[mid]){
                    return rotatedArray(arr, target, start, mid);
                }else{
                    return rotatedArray(arr, target, mid + 1, end);
                }
            }
            if(target >= arr[mid] && target <= arr[end])
                return rotatedArray(arr, target, mid + 1, end);
            else{
                return rotatedArray(arr, target, start, mid - 1);
            }
        }


    
}
