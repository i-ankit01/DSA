package Strings;

import java.util.Arrays;

// Leetcode question no. = 14

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int index = 0;
        while(index < first.length() && index < last.length()){
            if(first.charAt(index) == last.charAt(index)) index++;
            else break;
       }
       return first.substring(0,index);
    }

    public static String longestCommonPrefixWithoutSorting(String[] strs){
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String word = strs[i];
            // while(!word.contains(ans)){ // this will not work because it will be true if its occuring in between also 
            //     ans = ans.substring(0, ans.length()-1);
            // }
            while(word.indexOf(ans)!= 0){
                ans = ans.substring(0, ans.length()-1);
                if(ans.isEmpty()) return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
