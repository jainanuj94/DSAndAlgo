package main;

public class GCD {

    public static void main(String[] args) {
        System.out.println(gcd(48,18));
        System.out.println(gcd(12,16));
        System.out.println(gcd(14,28));
    }

    private static int gcd(int a, int b) {
        if(a<0 || b<0) return -1;
        if(b==0) return a;
        return gcd(b, a%b);
    }
}
