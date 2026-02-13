package Strings;

// Leetcode question no => 8 

public class StringToAtoi {

    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int n = s.length();

        int i = 0;
        while (i < n && s.charAt(i) == ' ') i++; // remember whenever do such while loop check i<n and after that check if (i==n) for edge cases
        if (i == n) return 0;

        boolean sign = true; // positive
        if (s.charAt(i) == '-') {
            sign = false;
            i++;
        } else if (s.charAt(i) == '+')
            i++;

        long ans = 0;
        while (i < s.length()) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                int value = s.charAt(i) - '0'; // (int) s.charAt(i) no need to cast it to int as java automatically does for performing arithmetic operations
                ans = ans * 10 + value;
            } 
            else break;

            if (sign && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (!sign && -ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return sign ? (int) ans : (int) -ans;
    }


    public static long getNumber(String s, int i, long ans){
        if(i>=s.length()) return ans;
        else if (!Character.isDigit(s.charAt(i)) || ans > Integer.MAX_VALUE) return ans;


        int value = s.charAt(i) - '0';
        ans = ans * 10 + value;

        return getNumber(s, i+1, ans);
    }
    public int myAtoiRecursiveWay(String s){
        if (s == null || s.length() == 0) return 0;

        int n = s.length();

        int i = 0;
        while (i < n && s.charAt(i) == ' ') i++; // remember whenever do such while loop check i<n and after that check if (i==n) for edge cases
        if (i == n) return 0;

        boolean sign = true; // positive
        if (s.charAt(i) == '-') {
            sign = false;
            i++;
        } else if (s.charAt(i) == '+')
            i++;

        long ans = 0;
    
        ans = getNumber(s,i ,ans);

        if(sign && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(!sign && -ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return sign ? (int) ans : (int) -ans;
    }
    public static void main(String[] args) {

    }
}
