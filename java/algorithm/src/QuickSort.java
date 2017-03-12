import java.util.Arrays;

/**
 * Created by machenfei on 2017/3/12.
 */
public class QuickSort {

    void sort(int[] data, int p, int r) {
        if (p < r) {
            int q = partition(data, p, r);
            sort(data, p, q - 1);
            sort(data, q + 1, r);
        }
    }

    int partition(int[] data, int p, int r) {
        int i = p - 1;
        int x = data[r];
        for (int j = p; j < r; j ++) {
            if (data[j] <= x) {
                i ++;
                int tmp = data[j];
                data[j] = data[i];
                data[i] = tmp;
            }
        }
        int tmp = data[i + 1];
        data[i + 1] = x;
        data[r] = tmp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] data = new int[]{4,3,5,2,1,6,4,2,3,1};
        QuickSort q = new QuickSort();
        q.sort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }
}
