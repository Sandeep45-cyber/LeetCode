import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(31);

        a.set(1,99);

        boolean contains = a.contains(1);

        System.out.println(a + " ");

        System.out.println(contains);

        for(int i = 0; i < 5; i++)
            a.add(in.nextInt());

//        for(int i = 0; i < a.toArray().length; i++)
//            System.out.print(Arrays.toString(new Integer[]{a.get(i)}));
//
//        System.out.println();
        for(int i = 0; i < 5; i++)
            System.out.println(a.get(i));


    }
}
