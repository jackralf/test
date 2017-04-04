import java.util.Arrays;

/**
 * Created by machenfei on 2017/4/4.
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int ret = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);

        for (int i = 0; i + 2 < nums.length; i ++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    j ++;
                } else {
                    k --;
                }
                if (Math.abs(sum - target) < Math.abs(ret - target)) {
                    ret = sum;
                }
            }
        }

        return ret;
    }

    public static void main(String[] args) {

    }
}
