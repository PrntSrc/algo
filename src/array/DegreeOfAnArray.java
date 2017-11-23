package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {
    public static void main(String[] args) {

    }
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                ArrayList<Integer> indexs = map.get(nums[i]);
                indexs.add(i);
                map.put(nums[i], indexs);
            } else
                map.put(nums[i], new ArrayList<>(i));
        }
        int maxKey = 0, maxSize = 0;
        for (Map.Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
            if (m.getValue().size() > maxSize) {
                maxKey = m.getKey();
                maxSize = m.getValue().size();
            }
        }
        int max = 0, min = Integer.MIN_VALUE;
        for (int i : map.get(maxKey)) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        return max - min + 1;
    }
}
