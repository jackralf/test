import java.util.Arrays;

/**
 * Created by machenfei on 2017/3/11.
 */
public class HeapSort {

    void maxHeapify(int[] data, int length, int index) {
        int left = (index << 1) + 1;
        int right = (index << 1) + 2;
        int largest;
        if (left < length && data[left] > data[index]) {
            largest = left;
        } else {
            largest = index;
        }
        if (right < length && data[right] > data[largest]) {
            largest = right;
        }

        if (largest != index) {
            int tmp = data[index];
            data[index] = data[largest];
            data[largest] = tmp;

            maxHeapify(data, length, largest);
        }
    }

    void buildMaxHeap(int[] data) {
        for (int i = data.length / 2 - 1; i >= 0; i --) {
            maxHeapify(data, data.length, i);
        }
    }

    void sort(int[] data) {
        buildMaxHeap(data);
        System.out.println(Arrays.toString(data));
        int length = data.length;
        for (int i = length - 1; i >= 1; i --) {
            int tmp = data[0];
            data[0] = data[i];
            data[i] = tmp;
            length --;
            maxHeapify(data, length, 0);
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{1,21,55,4,23,2,53,43,3,5,4,34};
        HeapSort h = new HeapSort();
        h.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
