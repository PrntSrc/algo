package sort;

public class SelectSort {
    public static void main(String[] args) {
        int[] nums = new int[] {13, 65, 97, 76, 38, 27, 49};
        selectSort(nums);
        for (int i : nums) System.out.println(i);
    }

    public static void selectSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = nums[i], index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    index = j;
                }
            }
            nums[index] = nums[i];
            nums[i] = min;
        }
    }
}
