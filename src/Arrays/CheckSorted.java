package Arrays;

import java.util.ArrayList;

public class CheckSorted {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3,5,5};
        findAllIndex(arr, 5, 0);
        System.out.println(list);
    }

    static boolean checkSorted(int[] arr, int index){
        
        if(index == arr.length - 1){
            return true;
        }

        return arr[index] < arr[index + 1] && checkSorted(arr, index + 1);
    }
    
    static boolean linearSearch(int[] arr, int index, int target){
        
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || linearSearch(arr, index + 1 , target);
    }

    static int checkIndex(int[] arr, int target, int index){

        if(index == arr.length)
            return -1;


        if(arr[index] == target){
            return index;
        }else{
            return checkIndex(arr, target, index + 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){

        if(index == arr.length)
            return;


        if(arr[index] == target){
            list.add(index);
        }
            findAllIndex(arr, target, index + 1);
    }
    
    
}
