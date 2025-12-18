public class MinNumber {

    static void main(String[] args) {

        int[]a = {-9,8,7,1};

        System.out.println(minNumber(a));

    }

    //what if i want to find the second lowest element?

    static int minNumber(int[]a) {

        int min = a[0]; //assume 1st is the least

        //iterate thorught the array
        for (int j : a) {
            if (min < j) //check if the minimum is the least among the elements.....if false
                return min;
            min = j;


        }

        return min;



    }
}
