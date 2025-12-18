import java.util.ArrayList;
import java.util.Scanner;

public class MultidimentionalList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();

        for(int i = 0; i< 3; i++)
            a.add(new ArrayList<>());

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                a.get(i).add(in.nextInt());
    }
}
