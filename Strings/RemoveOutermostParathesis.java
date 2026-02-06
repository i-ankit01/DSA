package Strings;

// Leetcode question no. = 1021

public class RemoveOutermostParathesis {

    public static String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++){
            if(count == 0 && s.charAt(i)=='('){
                start = i;
                count++;
            }
            else if(s.charAt(i)=='('){
                count++;
            }
            else {
                count--;
            }
            if(count == 0){
                res.append(s.substring(start+1, i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
}


//String[] words = s.split("\\s+");