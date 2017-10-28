package sort;

import java.util.Arrays;

/**
 * Created by Yue on 2017/10/26.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[] {3, 4, 5, 2, 1, 9, 8};
        quickSort(nums, 0, nums.length - 1);
        for (int n : nums) System.out.println(n);
    }

    public static void quickSort(int[] nums, int l, int u) {
        if (l >= u)
            return;
        int m = l;
        for (int i = l + 1; i <= u; i++) {

        }
    }
}
