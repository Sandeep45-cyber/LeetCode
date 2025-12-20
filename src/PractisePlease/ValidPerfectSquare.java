package PractisePlease;




// Given a positive integer num, return true if num is a perfect square or false otherwise.

// A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

// You must not use any built-in library function, such as sqrt.

 

// Example 1:

// Input: num = 16
// Output: true
// Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
// Example 2:

// Input: num = 14
// Output: false
// Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.


public class ValidPerfectSquare {
    public static void main(String[] args) {

        System.out.println(isPerfectSquare(16));
        
    }

    static boolean isPerfectSquare(int num){

        // Base case: 1 is a perfect square (1 * 1 = 1)
        if(num < 2)
            return num == 1;


        // Binary search approach: We're searching for a number 'mid' such that mid * mid == num
        // Search space: [0, num/2] because sqrt(num) <= num/2 for num >= 2
        int start = 0;
        int end = num/2;

        while(start <= end){
            // Calculate middle point
            int mid = start + (end - start)/2;
            
            // Calculate mid squared (use long to prevent integer overflow)
            // Example: if mid = 5, then square = 25
            long square = (long)mid * mid;

            // If mid * mid == num, we found the perfect square root!
            // Example: if num = 16 and mid = 4, then 4*4 = 16, return true
            if(square == num)
                return true;
            // If mid * mid > num, the square is too large
            // So the answer must be in the left half (smaller values)
            // Example: if num = 16 and mid = 5, then 5*5 = 25 > 16, search left
            else if(square > num)
                end = mid - 1;
            // If mid * mid < num, the square is too small
            // So the answer must be in the right half (larger values)
            // Example: if num = 16 and mid = 3, then 3*3 = 9 < 16, search right
            else
                start = mid + 1;
        }

        return false;
    }
    
}
