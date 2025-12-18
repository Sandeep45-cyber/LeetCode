public class StringLinearSearch {

    static void main(String[] args) {

        String s = "sandeep";
        char target = 'o';

        System.out.println(linearSearch(s, target));


    }

    static boolean linearSearch(String s, char target) {

        if(s.isEmpty())
            return false;

        for(int i = 0; i<s.length(); i++)
            if(target == s.charAt(i))
                return true;
        return false;

    }
}
