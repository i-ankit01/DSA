package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Leetcode question no = 40 

public class CombinationSum2 {

    public static void findCombinations(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> list ){
        
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(index == candidates.length) return;

        for(int i = index; i<candidates.length; i++){
            if(i > index && candidates[i-1] == candidates[i]) continue;
            if(candidates[i] > target) break;

            list.add(candidates[i]);
            findCombinations(i+1, candidates, target-candidates[i], ans, list);
            list.remove(list.size() -1);
        }

        return;
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);

        findCombinations(0, candidates, target, ans, list);
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
