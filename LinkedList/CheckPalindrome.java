package LinkedList;

import java.util.ArrayList;

// Leetcode question no = 234

public class CheckPalindrome {

    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> temp = new ArrayList<>();
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            temp.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null ) slow = slow.next; // considering odd lenght skip the middle one where slow is standing as it will occur only once 

        int n = temp.size();
        for (int i = n - 1; i >= 0; i--) {
            if (temp.get(i) != slow.val) return false;
            slow = slow.next;

        }
        return true;
    }

    public static void main(String[] args) {

    }
}
