package LinkedList;

/*
 * Problem: Intersection of Two Linked Lists
 * Approach: Find the lengths of both lists, move the pointer
 *           of the longer list ahead by the length difference,
 *           then move both pointers together until they meet.
 * TC: O(n + m) | SC: O(1)
 */

public class IntersectionOfTwoLinkedList_9 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // Find length of List A
        int lenA = 0;
        ListNode tempA = headA;

        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }

        // Find length of List B
        int lenB = 0;
        ListNode tempB = headB;

        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }

        // Create pointers at the heads
        ListNode a = headA;
        ListNode b = headB;

        // Move the longer list pointer ahead
        if (lenA > lenB) {

            int diff = lenA - lenB;

            while (diff > 0) {
                a = a.next;
                diff--;
            }

        } else {

            int diff = lenB - lenA;

            while (diff > 0) {
                b = b.next;
                diff--;
            }
        }

        // Move both pointers together
        while (a != b) {
            a = a.next;
            b = b.next;
        }

        return a;
    }

    public static void main(String[] args) {

        /*
         * List A:
         * 10 → 20
         *          ↘
         *           30 → 40
         *
         * List B:
         * 5 → 15 ↗
         */

        ListNode common1 = new ListNode(30);
        ListNode common2 = new ListNode(40);

        common1.next = common2;

        ListNode headA = new ListNode(10);
        headA.next = new ListNode(20);
        headA.next.next = common1;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(15);
        headB.next.next = common1;

        ListNode result = getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("Intersection Node: " + result.data);
        } else {
            System.out.println("No Intersection");
        }
    }
}