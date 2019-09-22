package medium;

/**
 * created on 2019-08-10
 *
 * @author dailinfu
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddTwoNum {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l4.next = l5;
        l5.next = l6;
        AddTwoNum addTwoNum = new AddTwoNum();

        addTwoNum.addTwoNumbers(l1, l4);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result1 = new ListNode(0);
        ListNode result = result1;
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode l11 = l1;
        ListNode l22 = l2;
        int d = 0;
        int e = 0;
        while (l11 != null && l22 != null) {
            int a = l11.val;
            int b = l22.val;
            int c = a + b + d;
            if (c >= 10) {
                c = c - 10;
                d = 1;
            } else {
                d = 0;
            }
            result.next = new ListNode(c);
            result = result.next;
            l11 = l11.next;
            l22 = l22.next;
            if (l11 == null) {
                e = d;
            } if (l22 == null) {
                e = d;
            }

        }
        while (l11 != null) {
            if (l11.val + e >= 10) {
                result.next = new ListNode(l11.val + e - 10);
                e = 1;
            } else {
                result.next = new ListNode(l11.val + e);
                e = 0;
            }
            result = result.next;
            l11 = l11.next;

        }
        while (l22 != null) {
            if (l22.val + e >= 10) {
                result.next = new ListNode(l22.val + e - 10);
                e = 1;
            } else {
                result.next = new ListNode(l22.val + e);
                e = 0;
            }
            result = result.next;
            l22 = l22.next;
        }
        if (e == 1) {
            result.next = new ListNode(e);
            result = result.next;
        }

        return result1.next;
    }
}
