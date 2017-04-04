package util;

/**
 * Created by machenfei on 2017/4/4.
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }
    public ListNode() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        ListNode tmp = this;
        while (tmp != null) {
            sb.append(tmp.val);
            sb.append("\t");
            tmp = tmp.next;
        }
        sb.append("\n");
        return sb.toString();
    }

    public static ListNode makeList(int[] data) {
        ListNode head = null;
        ListNode cur = null;
        for (int i = 0; i < data.length; i ++) {
            ListNode tmp = new ListNode(data[i]);
            if (head == null) {
                head = tmp;
                cur = head;
            } else {
                cur.next = tmp;
                cur = tmp;
            }
        }

        return head;
    }
}
