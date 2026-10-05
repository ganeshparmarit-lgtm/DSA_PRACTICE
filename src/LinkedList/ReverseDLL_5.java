package LinkedList;

/*
 * Problem: Reverse a Doubly Linked List
 * Approach: Reverse the links of the linked list using
 *           previous, current and next pointers.
 * TC: O(n) | SC: O(1)
 */

public class ReverseDLL_5 {

    public static ListNode reverseDLL(ListNode head) {

        ListNode previous = null;
        ListNode current = head;

        while (current != null) {

            ListNode next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        return previous;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        head = reverseDLL(head);

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}
