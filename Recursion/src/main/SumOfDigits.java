package main;

/**
 * How to find the sum of digits of a positive integer number
 * using recursion
 *
 * 10 == 1
 * 54 == 9
 * 112 == 4
 */
public class SumOfDigits {


    public static void main(String[] args) {
        System.out.println(sumOfDigits(0));
        System.out.println(sumOfDigits(10));
        System.out.println(sumOfDigits(54));
        System.out.println(sumOfDigits(112));
    }

    private static int sumOfDigits(int number) {
        if(number == 0) return 0;
        return number%10 + sumOfDigits(number/10);
    }


}
