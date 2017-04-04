import util.ListNode;

import java.util.Arrays;

/**
 * Created by machenfei on 2017/4/4.
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        ListNode nNode = cur;
        for (int i = 0; i < n + 1; i ++) {
            cur = cur.next;
            if (cur == null) {
                if (n > i + 1) {
                    return head;
                } else if (n == i + 1) {
                    return head.next;
                }
            }
        }

        while (cur != null) {
            cur = cur.next;
            nNode = nNode.next;
        }

        nNode.next = nNode.next.next;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.makeList(new int[]{1,2,3,4,5});
        RemoveNthFromEnd r = new RemoveNthFromEnd();
        ListNode result = r.removeNthFromEnd(head, 5);
        System.out.println(result);
    }
}
