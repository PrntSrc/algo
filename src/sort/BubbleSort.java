package sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = new int[] {36, 25, 48, 12, 25, 65, 43, 57};
        bubbleSort(nums);
        for (int i : nums) System.out.println(i);
    }

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
