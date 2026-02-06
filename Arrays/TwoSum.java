package Arrays;

import java.util.HashMap;

// Leetcode question no = 1

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if(mp.containsKey(remaining)){
                arr[0] = mp.get(remaining);
                arr[1] = i;
                return arr;
            }
            mp.put(nums[i], i);
        }
        return arr;
    }
    public static void main(String[] args) {
        
    }
}
