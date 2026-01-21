package Recursion;
import java.util.*;

public class LetterCombinations {

    public static String getValue(int num) {
        switch (num) {
            case 2:
                return "abc";
            case 3:
                return "def";
            case 4:
                return "ghi";
            case 5:
                return "jkl";
            case 6:
                return "mno";
            case 7:
                return "pqrs";
            case 8:
                return "tuv";
            case 9:
                return "wxyz";
            default:
                return "default";
        }
    }

    public static ArrayList<String> printCombinations(String p, String up){
        
        ArrayList<String> finalAns = new ArrayList<>();

        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        int digit = up.charAt(0) - '0';
        String values = getValue(digit);
        for (int i = 0; i < values.length(); i++) {
            finalAns.addAll(printCombinations(p + values.charAt(i), up.substring(1)));
        }

        return finalAns;
    }

    public static void main(String[] args) {
        
        String digits = "23";
        
        if(digits.isEmpty()) return;
        System.out.println(printCombinations("", digits));

        // ArrayList<String> ans = new ArrayList<>();
        // printCombinations("", "23", ans);
        // System.out.println(ans);
    }
}
