package Strings;

// Leetcode question = 1903

public class LargestOddNumberInString {

    public static String largestOddNumber(String num) {
        int end  = num.length()-1;
        while(end >= 0){
            int number = num.charAt(end) - '0';
            if(number %2 == 0) end--;
            else return num.substring(0, end+1);
        }
        return "";
    }
    public static void main(String[] args) {
        
    }
}
