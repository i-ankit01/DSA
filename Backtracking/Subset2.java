package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Leetcode question no = 90

// Brute force soln is that store all the elements of nums into a set then find all the combinations and return 
public class Subset2 {

    public static void findCombinations(int index, int[] nums, List<List<Integer>> ans, List<Integer> list) {
        ans.add(new ArrayList<>(list));

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i - 1] == nums[i])
                continue;
            list.add(nums[i]);
            findCombinations(i + 1, nums, ans, list);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        findCombinations(0, nums, ans, list);
        return ans;
    }

    public static void main(String[] args) {

    }
}
