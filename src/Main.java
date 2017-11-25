import java.math.BigInteger;

/**
 * Created by Yue on 2017/10/13.
 */
public class Main {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1.equals(s2));
    }

//    public static boolean isOneBitCharacter(int[] nums) {
//        if (nums.length != 0) {
//            for (int i = 1; i < nums.length; i++) {
//                int temp = nums[i], j = i;
//                if (nums[j - 1] > temp) {
//                    while (j >= 1 && nums[j - 1] > temp) {
//                        nums[j] = nums[j - 1];
//                        j--;
//                    }
//                    nums[j] = temp;
//                }
//            }
//        }
//    }
}
