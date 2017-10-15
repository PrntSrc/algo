package array;

import java.util.Arrays;
/*
leetcode no.561
 */
public class ArrayPartitionI {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 4, 2, 3};
        System.out.println(arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2)
            sum += nums[i];
        return sum;
    }
}
