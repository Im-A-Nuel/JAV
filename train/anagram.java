package train;

import java.util.StringJoiner;

/**
 * anagram
 */
public class anagram {

    static void check(String kata1, String kata2){
        String word = kata1;
        char[] kata = kata2.toLowerCase().toCharArray();
        System.out.println(word);
        System.out.println(kata);
    }

    public static void main(String[] args){
        check("nama", "mama");
    }
}