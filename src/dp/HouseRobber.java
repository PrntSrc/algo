package dp;

import java.util.Stack;

/**
 * Created by Yue on 2017/10/15.
 * leetcode no.198
 */
public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = new int[] {7, 3, 5, 9, 6, 4};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        if (nums.length < 2)
            return nums.length == 0 ? 0 : nums[0];
        int preMax = nums[0];
        int curMax = Math.max(preMax, nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int temp = curMax;
            curMax = Math.max(curMax, preMax + nums[i]);
            preMax = temp;
        }
        return curMax;
    }
}
