package Stacks;

import java.util.Stack;

public class InfixToPrefix {

    public static int precedence(char ch) {
        if (ch == '^')
            return 3;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '+' || ch == '-')
            return 1;
        return 0;
    }

    public String infixToPrefix(String s) {
        // code here
        s = new StringBuilder(s).reverse().toString();

        StringBuilder temp = new StringBuilder(s);

        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '(')
                temp.setCharAt(i, ')');
            else if (temp.charAt(i) == ')')
                temp.setCharAt(i, '(');
        }

        s = temp.toString();

        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9' || ch >= 'A' && ch <= 'Z') {
                res.append(ch);
            } else if (ch == '(')
                st.push(ch);
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(')
                    res.append(st.pop());
                st.pop();
            } else {
                while (!st.isEmpty() && (precedence(ch) < precedence(st.peek())
                        || (precedence(ch) == precedence(st.peek()) && ch == '^'))) { // because in infix to prefix when you reverse 
                                                                                      // + - * / these works as right associative do not pop on equal
                                                                                      // on equal precedence and ^ follows left associative
                                                                                      // → pop on equal precedence
                    res.append(st.pop());
                }
                st.push(ch);
            }

        }
        while (!st.isEmpty())
            res.append(st.pop());
        return res.reverse().toString();
    }

    public static void main(String[] args) {

    }
}
