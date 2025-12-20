package Easy;

public class sumOfDigits {

    static void main(String[] args) {
        int ans = count(15200, 0);
        System.out.println(ans);

    }

    static int sum(int n){
        if(n == 0)
            return 0;

        int rem = n %10;
        int N = n/10;

        return rem + sum(N);
    }

    static int count(int n, int c){
        if(n == 0)
            return c;

        int rem = n % 10;

        if(rem == 0) {
            return count(n / 10, c + 1);
        }
        return count(n / 10, c);
    }

    static int sum = 0;
    static void reverse(int n){
        if(n == 0){
            return;
        }

        int N = n % 10;



        sum = sum * 10 + N;


        reverse(n/10);
    }
}
