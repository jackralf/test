import java.util.Arrays;

/**
 * Created by machenfei on 2017/3/12.
 */
public class MergeSort {

    void merge(int[] data, int p, int q, int r) {
        int[] tmp = new int[r - p + 1];
        int i = p;
        int j = q + 1;
        int k = 0;
        while (i <= q && j <= r) {
            if (data[i] <= data[j]) {
                tmp[k ++] = data[i ++];
            } else {
                tmp[k ++] = data[j ++];
            }
        }

        while (i <= q) {
            tmp[k ++] = data[i ++];
        }
        while (j <= r) {
            tmp[k ++] = data[j ++];
        }

        System.arraycopy(tmp, 0, data, p, r - p + 1);
    }

    void sort(int[] data, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(data, p, q);
            sort(data, q + 1, r);
            merge(data, p, q, r);
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{4,3,5,2,1,6,4,2,3,10};
        MergeSort fun = new MergeSort();
        fun.sort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }
}
