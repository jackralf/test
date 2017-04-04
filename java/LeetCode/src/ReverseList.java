/**
 * Created by machenfei on 2017/4/2.
 */
public class ReverseList {
    class ListNode {
        ListNode(int x) {value = x;}
        int value;
        ListNode next;
    }

    ListNode reverse(ListNode node) {
        ListNode cur = node;
        ListNode prev = null;

        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = prev;

            prev = cur;
            cur = tmp;
        }

        return prev;
    }

    public void printList(ListNode l) {
        while(l != null) {
            System.out.print(l.value + ",");
            l = l.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        ReverseList list = new ReverseList();
        ListNode l = list.new ListNode(1);
        l.next = list.new ListNode(2);
        l.next.next = list.new ListNode(3);
        l.next.next.next = list.new ListNode(4);

        list.printList(l);
        ListNode l1 = list.reverse(l);
        list.printList(l1);
    }
}
