package array;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode no.532
 */

public class KDiffPairsInAnArray {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        int k = 1;
        System.out.println(findPairs(nums, k));
    }

    public static int findPairs(int[] nums, int k) {
        if (nums.length == 0 || nums == null || k < 0)
            return 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2)
                    count++;
            } else {
                if (map.containsKey(entry.getKey() + k))
                    count++;
            }
        }
        return count;
    }
}
