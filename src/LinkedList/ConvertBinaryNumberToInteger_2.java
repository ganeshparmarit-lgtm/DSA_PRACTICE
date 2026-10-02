package LinkedList;

/*
 * Problem: Convert Binary Number in a Linked List to Integer
 * Approach: Traverse the linked list and build the decimal value
 *           using ans = ans * 2 + current node value.
 * TC: O(n) | SC: O(1)
 */


public class ConvertBinaryNumberToInteger_2 {

    public static int getDecimalValue(ListNode head) {

        ListNode temp = head;
        int ans = 0;

        while (temp != null) {

            ans = ans * 2 + temp.data;

            temp = temp.next;
        }

        return ans;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);

        System.out.println(getDecimalValue(head));
    }
}