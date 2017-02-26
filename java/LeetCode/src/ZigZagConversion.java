/**
 * Created by machenfei on 2017/2/26.
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuffer sb = new StringBuffer("");
        int len = s.length();
        int k = 2 * numRows - 2;
        int idx = 0;
        while (idx < numRows) {
            for (int n = 0; (k * n + idx < len) && (n + idx < len); n ++) {
                if (idx == 0) {
                    sb.append(s.charAt(k * n));
                } else if (idx == numRows - 1) {
                    sb.append(s.charAt(k * n + numRows - 1));
                } else {
                    sb.append(s.charAt(k * n + idx));
                    if (k * n + k - idx < len) {
                        sb.append(s.charAt(k * n + k - idx));
                    }
                }
            }
            idx ++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        ZigZagConversion z = new ZigZagConversion();
        String res = z.convert("AB", 1);
        System.out.println(res);
    }
}
