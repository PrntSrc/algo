package array;

/**
 * leetcode no.665
 */
public class NonDecreasingArray {

    public static void main(String[] args) {
        int[] nums = new int[] {4, 2, 1};
        System.out.println(checkPossibility(nums));
    }

    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                count++;
            if (count > 1)
                return false;
        }
        return true;
    }
}
