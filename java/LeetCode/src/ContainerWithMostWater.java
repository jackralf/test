/**
 * Created by machenfei on 2017/3/18.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int length = height.length;
        int maxArea = 0;
        int i = 0;
        int j = length - 1;
        while (j > i) {
            maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j]) {
                i ++;
            } else {
                j --;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater c = new ContainerWithMostWater();
        int[] data = new int[10];
        int area = c.maxArea(data);
        System.out.println(area);
    }
}
