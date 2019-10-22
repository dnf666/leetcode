package simple;

/**
 * created on 2019/10/7
 *
 * @author dailinfu
 */
public class 链表合并 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //创建一个节点
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            } else {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            }
        }
        if (l1 != null) {
            cur.next = l1;
        } else {
            cur.next = l2;
        }
        return head.next;
    }
}
