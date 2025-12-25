package Easy;

public class SkipCharacter {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("abappple"));
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


    static String skipApple(String word){

        if(word.isEmpty())
            return "";

        if( word.startsWith("apple")){
            return skipApple(word.substring(5));
        }else{
            return word.charAt(0) + skipApple(word.substring(1));
        }
    }


    static String skipAppNotApple(String word){

        if(word.isEmpty())
            return "";

        if( word.startsWith("app") && !word.startsWith("apple")){
            return skipAppNotApple(word.substring(3));
        }else{
            return word.charAt(0) + skipAppNotApple(word.substring(1));
        }
    }
}
