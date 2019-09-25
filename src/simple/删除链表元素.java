package simple;


/**
 * created on 2019/9/25
 *
 * @author dailinfu
 */
public class 删除链表元素 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(3);

        listNode.next = l2;
        l2.next = l3;
        ListNode result = deleteIterms(listNode,1);
    }

    private static ListNode deleteIterms(ListNode head , int val) {
        if (head == null){
            return null;
        }
        while(head!=null&&head.val ==val){
            head = head.next;
        }
        if(head == null){
            return null;
        }
        ListNode temp = head;
        while(temp.next!=null){
            if (temp.next.val == val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}
