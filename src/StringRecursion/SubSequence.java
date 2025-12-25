package StringRecursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSequence {

    static void main(String[] args) {

        subSequence("", "abc");

    }


    static  void subSequence(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSequence(p + ch, up.substring(1));
        subSequence(p, up.substring(1));



    }


    static ArrayList<String> subSet(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSet(p + ch, up.substring(1));
        ArrayList<String> right = subSet(p, up.substring(1));

        left.addAll(right);

        return left;

    }


    static ArrayList<String> subSetAscii(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSet(p + ch, up.substring(1));
        ArrayList<String> right = subSet(p, up.substring(1));

        left.addAll(right);

        return left;

    }
}
