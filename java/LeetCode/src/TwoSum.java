import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by machenfei on 2017/2/18.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {11, 7, 2, 15};
        int target = 9;

        TwoSum t = new TwoSum();
        int[] res = t.twoSum(nums, target);
        System.out.println(res[0] + "," + res[1]);
    }
}
