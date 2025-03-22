    import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1; // Pointer to track stack top

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch; // Push opening bracket
            } else {
                if (top == -1) return false; // No matching opening bracket

                char last = stack[top--]; // Pop from stack
                if ((ch == ')' && last != '(') ||
                    (ch == '}' && last != '{') ||
                    (ch == ']' && last != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }

        return top == -1; // Stack should be empty if valid
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));        // true
        System.out.println(isValid("(){}[]"));    // true
        System.out.println(isValid("{[()]}"));    // true
        System.out.println(isValid("{[(])}"));    // false
        System.out.println(isValid("({[)]}"));    // false
        System.out.println(isValid("((("));       // false
    }
}
    
