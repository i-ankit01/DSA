package LinkedList;

import java.util.HashMap;

// Leetcode question no. = 142

public class StartingOfTheLoop {

    // Approach 1 : 
    public ListNode detectCycle1(ListNode head) {
        HashMap<ListNode, Integer> mp = new HashMap<>();
        ListNode temp = head;
        while(temp!= null){
            if(mp.containsKey(temp)){
                return temp;
            }
            mp.put(temp, 1);
            temp = temp.next;
        }
        return null;
    }

    // Approach 2 :
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        
    }
}
