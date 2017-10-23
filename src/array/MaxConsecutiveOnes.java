package array;

/**
 * Created by Yue on 2017/10/23.
 * leetcode no.485
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = new int[] {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, cur = 0;
        for (int i : nums)
            max = Math.max(max, cur = i == 0 ? 0 : cur + 1);
        return max;
    }
}
