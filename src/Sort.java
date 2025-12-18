import java.util.Arrays;

public class Sort {
    static void main() {
        int[] a = {18, 2, 5, 7, 9};

        sort(a, 1, 3);

        System.out.println(Arrays.toString(a));

    }

    static void sort(int[] a, int IndexA, int IndexB) {

        int temp = a[IndexA];
        a[IndexA] = a[IndexB];
        a[IndexB] = temp;



    }
}
