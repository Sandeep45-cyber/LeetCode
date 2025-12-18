public class SearchIn2D {

    static void main(String[] args) {
        int[][] a = {
                {1, 5, 4, 21},
                {4, 32, 90, 74},
                {6, 8, 21, 42},
                {99, 32, 66, 84}
        };

        int target = 666;

        System.out.println(search(a, target));
    }

    static boolean search(int[][] a, int target) {

        for(int i = 0; i< a.length; i++)
            for(int j = 0; j < a[i].length; j++)
            {
                if(a[i][j]==target)
                    return true;
            }
        return false;

    }
}
