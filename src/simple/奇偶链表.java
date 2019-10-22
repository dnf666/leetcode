package simple;

import java.util.ArrayList;
import java.util.List;

/**
 * created on 2019/10/21
 *
 * @author dailinfu
 */

public class 奇偶链表 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode events = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = events;
        return head;
    }

    public ListNode test(ListNode head) {
        if (head == null) {
            return null;
        }
        List<Integer> test = new ArrayList<>();
        ListNode head2 = head;
        while (head2 != null) {
            test.add(head2.val);
            head2 = head2.next;
        }
        List<Integer> odd1 = new ArrayList<>();
        List<Integer> even1 = new ArrayList<>();
        for (int i = 0; i < test.size(); i++) {
            if (i % 2 == 0) {
                odd1.add(test.get(i));
            } else {
                even1.add(test.get(i));
            }
        }
        odd1.addAll(even1);
        ListNode head1 = head;
        for (int i = 0; i < odd1.size(); i++) {
            head1.val = odd1.get(i);
            head1 = head1.next;
        }
        return head;

    }
}
