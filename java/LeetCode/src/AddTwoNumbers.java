import java.util.ArrayList;

/**
 * Created by machenfei on 2017/2/19.
 */
public class AddTwoNumbers {

    public static class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode c3 = new ListNode(0);
        ListNode c4 = c3;
        int sum = 0;
        while (c1 != null || c2 != null) {
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }

            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }

            c3.next = new ListNode(sum % 10);
            sum = sum / 10;
            c3 = c3.next;
        }

        if (sum > 0) {
            c3.next = new ListNode(sum);
        }

        return c4.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers t = new AddTwoNumbers();
        ListNode l1 = t.makeList(new ArrayList<Integer>(){{add(5);}});
        ListNode l2 = t.makeList(new ArrayList<Integer>(){{add(5);}});
        ListNode l3 = t.addTwoNumbers(l1, l2);
        t.printList(l3);
    }

    public ListNode makeList(ArrayList<Integer> list) {
        ListNode l = null;
        ListNode last = null;
        for (int value : list) {
            ListNode tmp = new ListNode(value);
            tmp.next = null;
            if (l == null) {
                l = tmp;
            }
            if (last != null) {
                last.next = tmp;
            }
            last = tmp;
        }

        return l;
    }

    public void printList(ListNode l) {
        while(l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }
}
