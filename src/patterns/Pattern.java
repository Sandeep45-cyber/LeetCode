package patterns;

public class Pattern {

    static void main(String[] args) {
        pattern1(4);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(4);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
    }

    static void pattern1(int n){

        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){

        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //or we can inner for looop n - i + 1
    static void pattern3(int n){

        for(int row = n; row > 0; row--){
            for(int col = row; col > 0; col --){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern4(int n){

        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col ++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){

        for(int row = 1; row <= 2*n; row++){
            int totalColumns = row > n ? 2 * n - row : row;
            for(int col = 1; col <= totalColumns; col ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){

        for(int row = 1; row <= 2*n; row++){
            int totalColumns = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColumns;
            for(int spaces = 0; spaces < noOfSpaces; spaces++){
                System.out.print(" ");
            }
            for(int col = 1; col <= totalColumns; col ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern7(int n){

    }
}
