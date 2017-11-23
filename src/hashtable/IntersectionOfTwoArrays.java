package hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * leetcode no.349
 */

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] num1 = new int[] {1, 2, 2, 1};
        int[] num2 = new int[] {2, 2};
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i : nums1)
            set.add(i);
        for (int i : nums2)
            if (set.contains(i)) {
                res.add(i);
                set.remove(i);
            }
        int[] a = new int[res.size()];
        for (int i = 0; i < res.size(); i++)
            a[i] = res.get(i);
        return a;
    }
}
