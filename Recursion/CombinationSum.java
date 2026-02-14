package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void possibleAnswers(int[] candidates, int target, int index, List<List<Integer>> ans, List<Integer> list){
        
        if(index == candidates.length) return;

        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        if(candidates[index] <= target){
            list.add(candidates[index]);
            possibleAnswers(candidates, target-candidates[index], index, ans, list);
            list.remove(list.size()-1);
        }

        possibleAnswers(candidates, target, index+1, ans, list);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        possibleAnswers(candidates, target, 0, ans, list);
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
