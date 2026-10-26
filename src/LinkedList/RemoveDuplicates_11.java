package LinkedList;

/*
 * Problem: Remove Duplicates from Sorted Linked List
 * Approach: Compare each node with the next node.
 *           If values are equal, skip the duplicate node.
 * TC: O(n) | SC: O(1)
 */

public class RemoveDuplicates_11 {

    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode current = head;

        while (current.next != null) {

            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        head = deleteDuplicates(head);

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}
