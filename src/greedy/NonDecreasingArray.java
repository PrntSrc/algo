package greedy;

/**
 * Created by Yue on 2017/11/4.
 * 665. Non-decreasing Array
 */
public class NonDecreasingArray {

    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
                if (i - 2 < 0 || nums[i - 2] <= nums[i]) nums[i - 1] = nums[i];
                else nums[i] = nums[i - 1];
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3, 4, 2, 3};
        System.out.println(checkPossibility(nums));
    }
}
