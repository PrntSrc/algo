package greedy;

/**
 * Created by Yue on 2017/11/4.
 * 665. Non-decreasing Array
 */
public class NonDecreasingArray {

    public static boolean checkPossibility(int[] nums) {
        if (nums.length <= 2)
            return true;
        int count = 0;
        for (int i = 0; i < nums.length - 1 && count <= 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                nums[i] = nums[i + 1];
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3, 4, 2, 3};
        System.out.println(checkPossibility(nums));
    }
}
