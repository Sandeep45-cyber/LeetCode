package StringRecursion;

public class SkipCharacter {
    public static void main(String[] args) {
        System.out.println(skip("aba"));
    }


    static String skip(String word){

        if(word.isEmpty())
            return "";

        char ch = word.charAt(0);

        if( ch == 'a'){
            return skip(word.substring(1));
        }else{
            return ch + skip(word.substring(1));
        }
    }
}
