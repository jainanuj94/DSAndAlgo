package main;

public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.println(toBinary(2));
        System.out.println(toBinary(3));
        System.out.println(toBinary(4));
    }

    private static int toBinary(int i) {
        if(i == 0) return 0;
        return i%2 + 10*toBinary(i/2);
    }
}
