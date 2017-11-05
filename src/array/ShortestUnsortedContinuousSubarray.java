package array;

/**
 * leetcode no.581
 */
public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
        int[] nums = new int[] {2, 3, 3, 2, 4};
        System.out.println(findUnsortedSubarray(nums));
    }

    public static int findUnsortedSubarray(int[] nums) {
        int n = nums.length, end = -2, beg = -1, max = nums[0], min = nums[n - 1];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - 1 - i]);
            if (nums[i] < max) end = i;
            if (nums[n - 1 - i] > min) beg = n - 1 - i;
        }
        return end - beg + 1;
    }
}
