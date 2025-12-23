package Arrays;

import java.util.ArrayList;

public class CheckSorted {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3,5,5};
        // findAllIndex(arr, 5, 0);
        // System.out.println(list);
        
        ArrayList<Integer> ans = new ArrayList<>(findAllIndex3(arr, 5, 0));
        System.out.println(ans);

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

    // static ArrayList<Integer> list = new ArrayList<>();
    // static void findAllIndex(int[] arr, int target, int index){

    //     if(index == arr.length)
    //         return;


    //     if(arr[index] == target){
    //         list.add(index);
    //     }
    //         findAllIndex(arr, target, index + 1);
    // }


    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list){

        if(index == arr.length)
            return list;


        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex2(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length)
            return list;


        if(arr[index] == target){
            list.add(index);
        }


        ArrayList<Integer> collectBelow = findAllIndex3(arr, target, index + 1);

        list.addAll(collectBelow);

        return list;
    }
    
    
}
