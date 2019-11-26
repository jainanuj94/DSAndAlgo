package stacksandqueues;

import java.util.Stack;

public class BalancedBrackets {

    public static char[][] TOKENS = {{'{', '}'},
                                     {'[', ']'},
                                     {'(', ')'}};

    public static boolean isBalance(String expression){
        Stack<Character> stack = new Stack<>();

        for(char c : expression.toCharArray()){
            if(isOpeningBracket(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty() || !matches(stack.pop(), c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean matches(char openTerm, char closeTerm) {
        for(char[] array: TOKENS){
            if(array[0] == openTerm){
                return array[1] == closeTerm;
            }
        }
        return false;
    }

    private static boolean isOpeningBracket(char c) {
        for(char[] array: TOKENS){
            if(array[0] == c){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isBalance("{{{}}}[]([])"));

        System.out.println(isBalance("{{{}}}}[{[}]([])"));
    }
}
