package Recursion;

import java.util.*;

public class DiceRollsSum {

    public static List<List<Integer>> findCombinations(ArrayList<Integer> p, ArrayList<Integer> up, int totalSum) {
        List<List<Integer>> finalAns = new ArrayList<>();
        if (totalSum == 0) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(p));
            return list;
        }

        for (int i = 0; i < up.size() && up.get(i) <= totalSum; i++) {
            // int required = totalSum - up.get(i); // not needed as condition is in for loop 
                p.add(up.get(i));
                List<List<Integer>> ans = findCombinations(p, up, totalSum - up.get(i));

                finalAns.addAll(ans);
                p.remove(p.size() - 1); // this is done because p is shared among all the calls and is a reference to the single object only 
        }
        return finalAns;
    }

    public static void main(String[] args) {
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> up = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        System.out.println(findCombinations(p, up, 4));

    }
}
