package LinkedList;

/*
 * Problem: Linked List Cycle
 * Approach: Use Floyd's Cycle Detection Algorithm with slow and fast pointers.
 *           Slow moves one step and fast moves two steps.
 *           If they meet, a cycle exists.
 * TC: O(n) | SC: O(1)
 */

public class LinkedListCycle_10 {

    public static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Create cycle: 4 → 2
        head.next.next.next.next = head.next;

        System.out.println(hasCycle(head));
    }
}
