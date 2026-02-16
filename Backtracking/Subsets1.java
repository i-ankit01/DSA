package Backtracking;

import java.util.ArrayList;
import java.util.List;

// Leetcode question no = 78

public class Subsets1 {

    public static void findCombinations(int index, int[] nums, List<List<Integer>> ans, List<Integer> list){
        int n = nums.length;
        if(index == n){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[index]);
        findCombinations(index+1, nums, ans, list);
        list.remove(list.size() - 1);
        findCombinations(index+1, nums, ans, list);

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        findCombinations(0, nums, ans, list);
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
