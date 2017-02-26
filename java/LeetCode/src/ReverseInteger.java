/**
 * Created by machenfei on 2017/2/26.
 */
public class ReverseInteger {
    public int reverse(int x) {
        boolean b = x > 0;
        char[] arr = String.valueOf(Math.abs(x)).toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (int i = arr.length - 1; i >= 0; i --) {
            sb.append(arr[i]);
        }

        int res = 0;
        try {
            res = Integer.valueOf(sb.toString());
        } catch (NumberFormatException e) {

        }

        if (!b) {
            res *= -1;
        }

        return res;
    }

    public int reverse1(int x) {
        int result = 0;

        while (x != 0) {
            int a = x % 10;
            int newValue = result * 10 + a;
            if ((newValue - a) / 10 != result) {
                return 0;
            }
            result = newValue;
            x /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        int a = r.reverse1(1000000003);
        System.out.println(a);
    }
}
