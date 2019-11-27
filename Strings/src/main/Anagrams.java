package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.util.Arrays;

/**
 * Given two strings (lowercase a->z), how many characters do we need to remove (from either)
 * to make an Anagram
 * EXAMPLE hello, billion ---> ANSWER: 6 he from hello and biin from billion;
 */
public class Anagrams {

    private static final int NUMBER_LETTERS = 26;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();

        System.out.println(numberNeeded(first, second));
    }

    private static int numberNeeded(String first, String second) {
        int[] charCount1 = getCharCounts(first);
        int[] charCount2 = getCharCounts(second);

        System.out.println("Char 1: " + Arrays.toString(charCount1));
        System.out.println("Char 2: " + Arrays.toString(charCount2));
        return getDelta(charCount1, charCount2);
    }

    private static int getDelta(int[] array1, int[] array2) {
        if(array1.length != array2.length){
            return -1;
        }

        int delta = 0;
        for(int i=0; i<array1.length; i++){
            int difference = Math.abs(array1[i] - array2[i]);
            delta += difference;
        }

        return delta;

    }

    private static int[] getCharCounts(String s) {
        int[] charCounts = new int[NUMBER_LETTERS];
        System.out.println(Arrays.toString(charCounts));
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int offset = (int) 'a';
            int code = c - offset;

            charCounts[code]++;
        }
        return charCounts;
    }
}
