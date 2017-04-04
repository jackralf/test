import java.util.Arrays;

/**
 * Created by machenfei on 2017/3/12.
 */
public class BubbleSort {
    void sort(int[] data) {
        int length = data.length;
        for (int i = 0; i < length - 1; i ++) {
            for (int j = 0; j < length - i - 1; j ++) {
                if (data[j] < data[j + 1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] data = new int[]{3,5,1,2,5,7,4,6};
        BubbleSort b = new BubbleSort();
        b.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
