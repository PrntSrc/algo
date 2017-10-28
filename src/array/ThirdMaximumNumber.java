package array;
/**
 * leetcode no.414
 */
public class ThirdMaximumNumber {

    public static void main(String[] args) {
        int[] nums = new int[] {2, 2, 3, 1};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        Integer maxFirst = null;
        Integer maxSecond = null;
        Integer maxThird = null;
        for (Integer i : nums) {
            if (i.equals(maxFirst) || i.equals(maxSecond) || i.equals(maxThird))
                continue;
            else if (maxFirst == null || i > maxFirst) {
                maxThird = maxSecond;
                maxSecond = maxFirst;
                maxFirst = i;
            } else if (maxSecond == null || i > maxSecond) {
                maxThird = maxSecond;
                maxSecond = i;
            } else if (maxThird == null || i > maxThird) {
                maxThird = i;
            }
        }
        return maxThird == null ? maxFirst : maxThird;
    }
}
