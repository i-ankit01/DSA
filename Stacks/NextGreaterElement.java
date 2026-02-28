package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for(int i = 0; i<nums1.length; i++){
            ans[i] = -1;
            for(int j = 0; j<nums2.length; j++){

                if(nums1[i] == nums2[j]){
                    int k = j+1;
                    while(k<nums2.length){
                        if(nums2[k] > nums2[j]){
                            ans[i] = nums2[k];
                            break;
                        }
                        k++;
                    }
                    break;
                }
            }
        }
        return ans;
    }

    // Optimised solution
    public int[] nextGreaterElementOptimised(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Deque<Integer> st = new ArrayDeque<>();
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = nums2.length-1; i>= 0; i--){
            while(!st.isEmpty() && st.peek() < nums2[i]) st.pop();
            if(st.isEmpty()) mp.put(nums2[i],-1);
            else mp.put(nums2[i], st.peek());
            st.push(nums2[i]);
        }

        for(int i = 0; i<nums1.length; i++){
            ans[i] = mp.get(nums1[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
