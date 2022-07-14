package main;

import java.util.Arrays;

public class BestScore {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstSecond(new int[]{84,85,89,90,23,53,60,39,10,49})));
    }

    private static int[] firstSecond(int[] myArray) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < myArray.length; i++) {
            max = Math.max(max, myArray[i]);
        }

        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] < max)
                secondMax = Math.max(secondMax, myArray[i]);
        }
        return new int[]{max, secondMax};
    }
}
