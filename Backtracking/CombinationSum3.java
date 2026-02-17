package Backtracking;

import java.util.ArrayList;
import java.util.List;

// Leetcode question no = 216

public class CombinationSum3 {

    public static void findCombinations(int number, int k , int n, List<List<Integer>> ans, List<Integer> list){
        if(k==0){
            if(n == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        for(int i = number; i<10; i++){
            if(i <= n){
                list.add(i);
                findCombinations(i+1, k-1, n-i, ans, list);
                list.remove(list.size() - 1);
            }
            else break;

        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(k>n) return ans;
        findCombinations(1, k, n, ans, list);
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
