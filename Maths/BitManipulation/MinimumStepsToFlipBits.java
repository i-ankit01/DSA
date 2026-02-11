package Maths.BitManipulation;

// Leetcode question no. = 2220

public class MinimumStepsToFlipBits {
    
    // public int minBitFlips(int start, int goal) {
    //     int count = 0;
    //     while(start != 0 || goal != 0 ){
    //         int s = start & 1;
    //         int g = goal & 1;
    //         if(s!=g) count++;
    //         start = start >> 1;
    //         goal = goal >> 1;
    //     }
    //     return count;
    // }

    public int minBitFlips(int start, int goal) {
        int ans = start^goal;
        int count = 0;
        while(ans != 0){
            ans = ans & (ans-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
