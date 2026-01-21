package Recursion;
import java.util.*;
public class Recursion{

    public static void printSubsequences(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        printSubsequences(p + up.charAt(0), up.substring(1));
        printSubsequences(p, up.substring(1));
    }

    public static void makeSubsequencesArrayList(String p, String up , ArrayList<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            return;
        }
        makeSubsequencesArrayList( p + up.charAt(0), up.substring(1), ans);
        makeSubsequencesArrayList( p, up.substring(1), ans);
    }

    public static ArrayList<String> returnSubsequences(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> left = returnSubsequences(p+up.charAt(0), up.substring(1));
        ArrayList<String> right = returnSubsequences(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    public static List<List<Integer>> returnSubsets(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }


    public static List<List<Integer>> returnUniqueSubsets(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0; 
        int end = 0;

        for(int i = 0; i<arr.length; i++){
            start = 0;
            if(i>0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }

    
    public static void main(String[] args) {
        // printSubsequences("","abc");

        // ArrayList<String> ans = new ArrayList<>();
        // makeSubsequencesArrayList("", "abc", ans);
        // System.out.println(ans);
        
        // System.out.println(returnSubsequences("","abc"));

        // System.out.println(returnSubsets(new int[] {1,2,3}));

        System.out.println(returnUniqueSubsets(new int[] {1,2,2}));
    }
}