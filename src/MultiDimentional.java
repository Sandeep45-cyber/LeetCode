import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentional {

    public static void main(){

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][2];

        System.out.println(arr.length);

        for(int row = 0; row < arr.length; row++ )
        {
            for( int col = 0; col < arr[row].length; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }

//        System.out.println(Arrays.deepToString(arr));
//        for (int[] ints : arr) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        for(int[]a : arr)
            System.out.println(Arrays.toString(a));


    }
}
