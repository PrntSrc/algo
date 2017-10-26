package array;

import java.util.Arrays;

/**
 * Created by Yue on 2017/10/26.
 * leetcode no.628
 */
public class MaximumProductOfThreeNumbers {

    public static void main(String[] args) {
        int[] nums = new int[] {-4, -3, -2, -1, 60};
        System.out.println(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n - 3] * nums[n - 2] * nums[n - 1], nums[0] * nums[1] * nums[n - 1]);
    }

}
