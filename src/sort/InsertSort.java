package sort;

public class InsertSort {

    public static void main(String[] args) {
        int[] nums = new int[] {38, 65, 97, 76, 13, 27, 49};
        insertSort(nums);
        for (int i : nums) System.out.println(i);
    }

    public static void insertSort(int[] nums) {
        if (nums.length != 0) {
            for (int i = 1; i < nums.length; i++) {
                int temp = nums[i], j = i;
                if (nums[j - 1] > temp) {
                    while (j >= 1 && nums[j - 1] > temp) {
                        nums[j] = nums[j - 1];
                        j--;
                    }
                    nums[j] = temp;
                }
            }
        }
    }
}
