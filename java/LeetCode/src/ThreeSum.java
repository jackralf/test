import java.util.*;

/**
 * Created by machenfei on 2017/4/2.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i + 2 < nums.length; i ++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            int target = -nums[i];
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum == target) {
                    ret.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j ++;
                    k --;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                } else if (sum < target) {
                    j ++;
                } else {
                    k --;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        ThreeSum t = new ThreeSum();
        List<List<Integer>> result = t.threeSum(new int[]{-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0});
        System.out.println(result);
    }
}
