package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yue on 2017/10/25.
 *
 * leetcode no.448
 */
public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] nums = new int[] {4, 3, 2, 7, 8, 2, 3, 1};
        for (Integer i : findDisappearedNumbers(nums))
            System.out.println(i);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0)
                nums[index] = - nums[index];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                res.add(i + 1);
        }
        return res;
    }

}
