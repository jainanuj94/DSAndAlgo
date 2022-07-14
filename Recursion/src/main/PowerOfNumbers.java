package main;

/**
 * How to calculate powerFunction of a number using recursion
 * 2^4 = 2*2*2*2
 */
public class PowerOfNumbers {
    public static void main(String[] args) {
        System.out.println(powerFunction(2, 4));
        System.out.println(powerFunction(4, 2));
        System.out.println(powerFunction(3, 3));
    }

    private static int powerFunction(int base, int power) {
        if(power == 0) return 1;
        return base * powerFunction(base, power-1);
    }
}
