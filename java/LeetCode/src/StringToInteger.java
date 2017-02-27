import sun.jvm.hotspot.runtime.ResultTypeFinder;

/**
 * Created by machenfei on 2017/2/27.
 */
public class StringToInteger {
    public int myAtoi(String str) {
        if (str.length() == 0) {
            return 0;
        }

        int result = 0;
        int i = 0;
        while (i < str.length() && Character.isSpaceChar(str.charAt(i))) {
            i ++;
        }

        int sign = 1;
        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            sign = str.charAt(i) == '-' ? -1 : 1;
            i ++;
        }

        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            int tmp = result * 10 +  str.charAt(i) - '0';
            if ((tmp < 0) || ((tmp - str.charAt(i) + '0') / 10 != result)) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = tmp;
            i ++;
        }

        return sign * result;
    }
    public static void main(String[] args) {
        StringToInteger s = new StringToInteger();
        int result = s.myAtoi("-1");
        System.out.println(result);
    }
}
