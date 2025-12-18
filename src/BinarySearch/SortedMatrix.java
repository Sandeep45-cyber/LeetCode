package BinarySearch;

public class SortedMatrix {
    static void main(String[] args) {

    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){

        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;

            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }

            if(matrix[row][mid] > target){
                cEnd = mid - 1;
            }else{
                cStart = mid + 1;
            }
        }

        return new int[]{ -1, -1};

    }

    static int[] search(int[][] matrix, int target){

        int rows = matrix.length;
        int cols = matrix[0].length; // no: of cols in the first row ------ but generally the number of cols

        //if we have only 1 row
        if(rows == 1){
            return binarySearch(matrix, 0, 0, matrix[0].length -1, target);
        }

        int rStart = 0;
        int rEnd = matrix.length - 1;
        int cMid = cols/2;

        //to make sure we have 2 rows at the end ( 2 < (3-1) ) false meaning 2
        while(rStart < (rEnd - 1)){

            int mid = rStart + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }

            if(matrix[mid][cMid] > target){
                rEnd = mid;
            }else{
                rStart = mid;
            }

        }

        //now we will have 2 rows

        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return  new int[]{rStart + 1, cMid};
        }

        //if we still dont find it, split in 4 halfs

        if(target <= matrix[rStart][cMid -1]) {
            return binarySearch(matrix, rStart, 0, cMid -1, target);
        }

        if(target <= matrix[rStart + 1][cMid -1]){
            return binarySearch(matrix, rStart + 1, 0, cMid -1, target);
        }

        //where the elements in the below row can also be
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols -1]){
            return binarySearch(matrix, rStart, cMid + 1, cols -1, target);
        }

        if(target >= matrix[rStart + 1][cMid + 1]){
            return binarySearch(matrix, rStart + 1, cMid + 1, cols -1, target);
        }



        return new int[]{ -1, -1};
    }
}
