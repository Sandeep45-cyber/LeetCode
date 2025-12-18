//package BinarySearch;
//
//public class FindInInfiniteLoop {
//    static void main(String[] args) {
//
//        int[] arr = {1, 3, 5, 10, 19, 21, 25, 32, 41, 77, 82, 93};
//
//        int target = 93;
//
//
//
//        System.out.println(search(arr, target));
//
//    }
//
//     static int search(int[] arr, int target){
//
//        int start = 0; // the first element in the array
//        int end = 1;
//
//        //static int search(int[] arr, int target){
//         //
//         //    int start = 0;
//         //    int end = 1;
//         //
//         //    while (true) {
//         //        // If end has gone beyond the array, clamp it and stop expanding
//         //        if (end >= arr.length) {
//         //            end = arr.length - 1;
//         //            break;
//         //        }
//         //
//         //        // If the target is within the current range, stop expanding
//         //        if (target <= arr[end]) {
//         //            break;
//         //        }
//         //
//         //        int newStart = end + 1;
//         //        end = end + (end - start + 1) * 2;
//         //        start = newStart;
//         //    }
//         //
//         //    return binarySearch(arr, target, start, end);
//         //}
//
//        while(target > arr[end]){
//            int newStart = end + 1;
//
//            end = end + (end - start + 1) * 2;
//            start = newStart;
//
//        }
//
//        return binarySearch(arr, target, start, end);
//
//
//    }
//
//    static int binarySearch(int[] arr, int target, int start, int end)
//    {
//        while(start <= end)
//        {
//            int mid = start + (end - start)/2;
//            if(target < arr[mid]){
//                end = mid - 1;
//            }else if(target > arr[mid]){
//                start = mid + 1;
//            }else{
//                return mid;
//            }
//        }
//        return -1;
//    }
//}
