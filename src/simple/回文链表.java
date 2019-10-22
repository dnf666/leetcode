package simple;

import java.util.ArrayList;
import java.util.List;

/**
 * created on 2019/10/21
 *
 * @author dailinfu
 */

public class 回文链表 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        l1.next = l2;
        System.out.println(isPalindrome(l1));
    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList();
        ListNode head1 = head;
        while (head1 != null) {
            list.add(head1.val);
            head1 = head1.next;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(list.size() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
