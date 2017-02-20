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
        int add = 0;
        ArrayList list = new ArrayList<Integer>();
        while (l1 != null && l2 != null) {
            int tmp = l1.val + l2.val;
            int val = (tmp + add) % 10;
            add = (tmp + add) / 10;
            list.add(val);
            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode l3 = null;
        if (l1 != null || l2 != null) {
            l3 = l1 != null ? l1 : l2;
        }

        while (l3 != null) {
            int val = (l3.val + add) % 10;
            add = (l3.val + add) / 10;
            list.add(val);
            l3 = l3.next;
        }

        if (add > 0) {
            list.add(add);
        }

        return makeList(list);
    }

    public static void main(String[] args) {
        AddTwoNumbers t = new AddTwoNumbers();
        ListNode l1 = t.makeList(new ArrayList<Integer>(){{add(1);add(8);}});
        ListNode l2 = t.makeList(new ArrayList<Integer>(){{add(0);}});
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
