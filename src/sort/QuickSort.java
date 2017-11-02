package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yue on 2017/10/26.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[] {3, 4, 5, 2, 1, 9, 8};
//        quickSort(nums, 0, nums.length - 1);
        for (int n : nums) System.out.println(n);
    }

    public static void quickSort(List<Integer> list) {
        if (list.size() > 1) {
            List<Integer> smaller = new ArrayList<>();
            List<Integer> same = new ArrayList<>();
            List<Integer> larger = new ArrayList<>();
            Integer selected = list.get(list.size() / 2);
            for (Integer i : list) {
                if (i < selected)
                    smaller.add(i);
                else if (i > selected)
                    larger.add(i);
                else
                    same.add(i);
            }
            quickSort(smaller);
            quickSort(larger);
            list.clear();
            list.addAll(smaller);
            list.addAll(same);
            list.addAll(larger);

        }
    }
}
