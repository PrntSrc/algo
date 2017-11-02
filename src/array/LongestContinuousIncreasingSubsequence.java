package array;

/**
 * Created by Yue on 2017/11/2.
 * leetcode no.674
 */
public class LongestContinuousIncreasingSubsequence {

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2};
        System.out.println(findLengthOfLCIS(nums));

    }

    public static int findLengthOfLCIS(int[] nums) {
        int count = 0, max = 0, cur = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (cur < nums[i]) {
                count++;
            }
            if (cur >= nums[i] || i == nums.length - 1){
                max = Math.max(max, count);
                count = 1;
            }
            cur = nums[i];
        }
        return max;
    }
}
