package RecursionPractice;

import java.util.*;

public class Permutation {

    public static ArrayList<String> allPermutations(String p, String up) {
        ArrayList<String> finalAns = new ArrayList<>();

        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        int length = p.length();
        for (int i = 0; i <= length; i++) {
            char ch = up.charAt(0);
            ArrayList<String> result = allPermutations(p.substring(0, i) + ch + p.substring(i), up.substring(1));
            
            finalAns.addAll(result);
        }
        return finalAns;
    }

    public static int countPermutations(String p, String up) {
        int count = 0;

        if (up.isEmpty()) {
            count++;
            return count;
        }
        int length = p.length();
        for (int i = 0; i <= length; i++) {
            char ch = up.charAt(0);
            int cnt = countPermutations(p.substring(0, i) + ch + p.substring(i), up.substring(1));
            
            count = count + cnt;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(allPermutations("", "abc"));
        System.out.println(countPermutations("", "abc"));
    }
}
