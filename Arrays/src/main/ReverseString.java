package main;

import java.util.Arrays;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        final char[] s = {'1', '2', '4', '5'};
        reverseString(s);
        System.out.println(s);
    }

    static void reverseString(char[] s){
        int startIndex = 0;
        int endIndex = s.length - 1;

        while(startIndex < endIndex){
            s[startIndex] ^= s[endIndex];
            s[endIndex] ^= s[startIndex];
            s[startIndex] ^= s[endIndex];

            startIndex++;
            endIndex--;
        }
    }
}
