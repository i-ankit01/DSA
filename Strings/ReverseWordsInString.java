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
        
    }

    public static void main(String[] args) {

    }
}
