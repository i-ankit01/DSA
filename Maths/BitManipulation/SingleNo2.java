package Maths.BitManipulation;

import java.util.Arrays;

// Leetcode question no. 137

public class SingleNo2 {

    // Approach 1
    // TC = O(N * 32)
    public int singleNumber1(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i<32; i++){
            int count = 0;
            for(int j = 0; j<n; j++){
                if((nums[j] & (1<<i)) != 0) count++;
            }
            if(count % 3 != 0){
                ans = ans | (1<<i);
            }
        } 
        return ans; 
    }

    // Approach 2
    // TC = O(N logN) + N/3 ... this is better but we are distorting the original array
    public int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 1; i<n; i=i+3){
            if(i == n) break;
            else if(nums[i] != nums[i-1]) return nums[i-1];
        }
        return nums[n-1];
    }

    // Approach 3 : bucket approach to be done later 
    public int singleNumber3(int[] nums) {
        return 0;
    }

    
    public static void main(String[] args) {
        
    }
}
