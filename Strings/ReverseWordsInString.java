package Strings;

// Leetcode question no. = 151

public class ReverseWordsInString {

    public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder res = new StringBuilder();
        String[] words = s.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i > 0) res.append(" ");
        }
        return res.toString();
    }

    public static String reverseWordsWithoutSplit(String s) {
        StringBuilder res = new StringBuilder();
        s = s.trim();
        int start = s.length()-1;
        int end = s.length()-1;
        while(start>=0){
            if(s.charAt(start) == ' '){
                res.append(s.substring(start+1, end+1) + " ");
                while(start >= 0 && s.charAt(start) == ' ') start--;
                end = start;
            }
            else start--;
        }
        res.append(s.substring(start+1, end+1));
        return res.toString();
    }

    public static void main(String[] args) {

    }
}
