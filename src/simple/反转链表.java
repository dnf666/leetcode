package simple;

import java.util.LinkedList;

/**
 * created on 2019/9/25
 *
 * @author dailinfu
 */

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class 反转链表 {
    public static void main(String[] args) {
        ListNode head = null;
        ListNode prev = null;
        ListNode temp = null;
        while(head != null)
        {
            temp = head;
            head = head.next;
            temp.next = prev;
            prev = temp;
        }
    }

}
