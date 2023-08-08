package LinkedList;
import java.util.*;


class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class IntersectionOfLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }

    public static void main(String[] args) {
        IntersectionOfLinkedList solution = new IntersectionOfLinkedList();

        // Create linked lists
        ListNode commonNode = new ListNode(8);
        commonNode.next = new ListNode(4);
        commonNode.next.next = new ListNode(5);

        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = commonNode;

        ListNode headB = new ListNode(6);
        headB.next = new ListNode(7);
        headB.next.next = commonNode;

        // Find the intersection point
        ListNode intersectionNode = solution.getIntersectionNode(headA, headB);

        if (intersectionNode != null) {
            System.out.println("Intersection Node Value: " + intersectionNode.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
