package LinkedList;

/*
 * Problem: Linked List Traversal
 * Approach: Traverse the linked list from head to end and store each node's data in a list.
 * TC: O(n) | SC: O(n)
 */

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class TraversalInLinkedList_1 {

    public static List<Integer> LLTraversal(ListNode head) {

        List<Integer> result = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {

            result.add(temp.data);

            temp = temp.next;
        }

        return result;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);

        System.out.println(LLTraversal(head));
    }
}