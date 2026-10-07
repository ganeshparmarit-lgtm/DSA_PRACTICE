package LinkedList;

/*
 * Problem: Palindrome Linked List
 * Approach: Find the middle using slow and fast pointers,
 *           reverse the second half, and compare both halves.
 * TC: O(n) | SC: O(1)
 */

public class PalindromeLinkedList_8 {

    public static boolean isPalindrome(ListNode head) {

        // Find the middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half
        ListNode previous = null;
        ListNode current = slow;

        while (current != null) {

            ListNode next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        // Compare first half and reversed second half
        ListNode first = head;
        ListNode second = previous;

        while (second != null) {

            if (first.data != second.data) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(head));
    }
}
