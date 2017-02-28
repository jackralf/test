/**
 * Created by machenfei on 2017/2/28.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = 0;
        while (Math.pow(10, n) < x) {
            n ++;
        }

        n --;
        while (n >= 0) {
            if (x / (int)(Math.pow(10, n)) != x % 10) {
                return false;
            }

            x = x % ((int)Math.pow(10, n)) / 10;
            n = n - 2;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        boolean result = p.isPalindrome(10);
        System.out.println(result);
    }
}
