package main;

public class FirstUpperCase {

    public static void main(String[] args) {
        System.out.println(first("asdjhjdsjhkS"));
    }

    private static char first(String str) {
        if (Character.isUpperCase(str.charAt(0))) return str.charAt(0);
        if (str.length() == 1)  return '1';
        return first(str.substring(1));
    }
}
