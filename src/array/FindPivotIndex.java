package array;

/**
 * Created by Yue on 2017/11/22.
 * leetcode no.724
 */
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = new int[] {-1,-1,-1,-1,0,1};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int left = 0, sum = 0;
        for (int i : nums) sum += i;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) left += nums[i - 1];
            if (sum - left - nums[i] == left) return i;
        }
        return -1;
    }
}
