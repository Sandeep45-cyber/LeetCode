public class SqrRoot {
    static void main() {
        System.out.println(mySqrt(8));
    }
    static int mySqrt(int x) {

        if(x < 2)
            return x;


        int start = 0;
        int end = x/2;

        int ans = 0;

        while(start <= end){
            int mid = start + (end - start)/2;

            long pow = (long) mid * mid;

            if(pow > x){
                end = mid -1;
            }
            else if(pow < x ){

                ans = mid;
                start = mid + 1;
            }else{
                return mid;
            }

        }
        return ans;
    }
}
