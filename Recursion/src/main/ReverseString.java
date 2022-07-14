package main;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("java"));
        System.out.println(reverse("kotlin"));
    }

    private static String reverse(String str) {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
