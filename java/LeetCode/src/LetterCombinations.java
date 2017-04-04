import java.util.*;

/**
 * Created by machenfei on 2017/4/4.
 */
public class LetterCombinations {
    char[][] letters = {
            {},
            {},
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'w'},
            {'w', 'x', 'y', 'z'}
    };
    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<String>();
        int len = digits.length();
        for (int i = 0; i < len; i ++) {
            int value = digits.charAt(i) - '0';
            int letterNum = letters[value].length;
            if (ret.isEmpty()) {
                for (char c : letters[value]) {
                    ret.add(String.valueOf(c));
                }
            } else {
                List<String> newList = new ArrayList<String>();
                for (int j = 0; j < letterNum; j++) {
                    List<String> tmp = new ArrayList<String>();
                    for (String str : ret) {
                        tmp.add(str + letters[value][j]);
                    }
                    newList.addAll(tmp);
                }
                ret = newList;
            }
        }

        return ret;
    }

    public List<String> letterCombinations1(String digits) {
        LinkedList<String> queue = new LinkedList<String>();
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        queue.add("");
        for (int i = 0; i < digits.length(); i ++) {
            int x = Character.getNumericValue(digits.charAt(i));
            while (queue.peek().length() == i) {
                String str = queue.pop();
                for (char s : mapping[x].toCharArray()) {
                    queue.add(str + s);
                }
            }
        }

        return queue;
    }

    public static void main(String[] args) {
        LetterCombinations t = new LetterCombinations();
        List<String> result =  t.letterCombinations1("23");
        System.out.println(result);
    }
}
