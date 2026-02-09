package Maths.BitManipulation;

// Leetcode question no. = 29

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean sign = true;
        long ans = 0;

        if(dividend >= 0 && divisor < 0) sign = false;
        else if  (dividend < 0 && divisor > 0) sign = false;

        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);

        while(n >= d){
            int count = 0;
            while((d << (count+1)) <= n) count++; // count + 1 bcz then only we will update count to ++;
            ans += 1<<count;
            n = n - (d << count);
        }

        if(ans > Integer.MAX_VALUE && sign) return Integer.MAX_VALUE;
        else if (ans > Integer.MAX_VALUE && sign == false) return Integer.MIN_VALUE;

        return sign ? (int)ans : (int)-ans;
    }
    public static void main(String[] args) {
        
    }
}
