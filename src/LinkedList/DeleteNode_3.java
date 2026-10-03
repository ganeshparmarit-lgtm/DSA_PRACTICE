package LinkedList;

/*
 * Problem: Delete the X-th Node from a Linked List
 * Approach: Use previous and current pointers to reach the X-th node,
 *           then skip that node using previous.next.
 * TC: O(n) | SC: O(1)
 */

public class DeleteNode_3 {

    public static ListNode deleteNode(ListNode head, int x) {

        // Empty list
        if (head == null) {
            return head;
        }

        // Delete first node
        if (x == 1) {
            return head.next;
        }

        ListNode previous = head;
        ListNode current = head.next;

        int position = 2;

        while (current != null) {

            if (position == x) {
                previous.next = current.next;
                return head;
            }

            previous = current;
            current = current.next;
            position++;
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        int x = 3;

        head = deleteNode(head, x);

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}
