package main;

public class LonelyInteger {

    private static int lonelyInteger(int[] array){
        int result = 0;
        for(int value : array){
            result ^= value;
        }
        return result;
    }
}
