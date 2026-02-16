package Strings;


// Leetcode question no. = 205

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] sArr = new int[256];
        int[] tArr = new int[256];

        for (int i = 0; i < t.length(); i++) {
            if(sArr[s.charAt(i)] != tArr[t.charAt(i)]) return false;

            // this makes sures that both the characters occurred at the same index (pos) last time
            sArr[s.charAt(i)] = i+1;
            tArr[t.charAt(i)] = i+1;
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
