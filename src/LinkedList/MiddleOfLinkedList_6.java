package LinkedList;

/*
 * Problem: Middle of the Linked List
 * Approach: Use slow and fast pointers.
 *           Slow moves one step, fast moves two steps.
 *           When fast reaches the end, slow is at the middle.
 * TC: O(n) | SC: O(1)
 */

public class MiddleOfLinkedList_6 {

    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode middle = middleNode(head);

        System.out.println(middle.data);
    }
}
