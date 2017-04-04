import java.util.Arrays;

/**
 * Created by machenfei on 2017/3/12.
 */
public class InsertionSort {

    void sort(int[] data) {
        int length = data.length;
        for (int i = 1; i < length; i ++) {
            int x = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > x) {
                data[j + 1] = data[j];
                j --;
            }
            data[j + 1] = x;
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{4,3,5,2,1,6,4,2,3,10};
        InsertionSort obj = new InsertionSort();
        obj.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
