package BinarySearch;

import java.util.Arrays;

public class RowColMatrix {
    static void main(String[] args) {

        int[][] arr = {
                {10, 20, 30, 40},
                {12, 22, 33, 44},
                {14, 24, 34, 54},
                {15, 25, 35, 45}
        };

        System.out.println(Arrays.toString(rowColMatrix(arr, 40)));

    }

    static int[] rowColMatrix(int[][]arr, int target){

        int r = 0;
        int c = arr.length -1;

        while(r < arr.length && c >= 0){
            if(arr[r][c] == target){
                return new int[]{r, c};
            }
            else if(arr[r][c] > target){
                c--;
            }else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
