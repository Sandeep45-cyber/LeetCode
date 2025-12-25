package StringRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {

    static void main(String[] args) {

        int[] arr = {1, 2, 2};

        List<List<Integer>> ans = subsetDuplicate(arr);

        for(List<Integer> list : ans){
            System.out.println(list);
        }

    }


    //DEBUG:::::: YOU WILL UNDERSTAND PERFECTLY

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        System.out.println(outer);

        for(int num: arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
                System.out.println(outer);
            }

        }

        return outer;
    }


    static List<List<Integer>> subsetDuplicate(int[] arr){

        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        System.out.println(outer);

        int start = 0;

        int end = 0;

        for(int i = 0; i < arr.length; i++){

            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() -1;
            int n = outer.size();
            for(int j = start; j < n; j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
                System.out.println(outer);
            }

        }

        return outer;
    }
}
