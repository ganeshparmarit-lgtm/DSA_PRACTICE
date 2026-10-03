package LinkedList;

/*
 * Problem: Delete Node in a Linked List
 * Approach: Copy the next node's data into the current node,
 *           then skip the next node.
 * TC: O(1) | SC: O(1)
 */

public class DeleteNode_4 {

    public static void deleteNode(ListNode node) {

        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        // Delete node 20
        ListNode node = head.next;

        deleteNode(node);

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}
