package Easy;

public class Nto1 {

    static void main(String[] args) {
        nTo1(5);
    }

    static void nTo1(int n){

        if(n == 0)
            return;
        System.out.println(n);
        nTo1(n -  1);
        System.out.println(n);
    }
}
