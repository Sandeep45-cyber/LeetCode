import java.util.Arrays;

public class Swap {

    static void main(String[] args) {
        int[] a = {2, 9, 3, 5};

        System.out.println(Arrays.toString(reverse(a)));

        System.out.println(Arrays.toString(swap(a, 1, 2)));
    }

    static int[] reverse(int[] a){
        int start = 0;
        int end = a.length-1;

        while(start < end){
            swap(a, start, end);

            start++;
            end--;
        }
    return a;

    }


    static int[] swap(int[] a, int element1, int element2){
        int temp = a[element1];
        a[element1] = a[element2];
        a[element2] = temp;
        return a;
    }
}
