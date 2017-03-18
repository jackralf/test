/**
 * Created by machenfei on 2017/3/18.
 */
public class IntegerToRoman {

    public String intToRoman(int num) {
        String[][] roman = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM"}
        };

        StringBuilder sb = new StringBuilder();
        sb.append(roman[3][num / 1000 % 10]);
        sb.append(roman[2][num / 100 % 10]);
        sb.append(roman[1][num / 10 % 10]);
        sb.append(roman[0][num % 10]);

        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
