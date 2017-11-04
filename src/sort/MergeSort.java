package sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = new int[] {49, 38, 65, 97, 76, 13, 27};
        mergeSort(nums);
        for (int i : nums) System.out.println(i);
    }

    public static void mergeSort(int[] nums) {
        int[] temp = new int[nums.length];
        mergeSort(nums, temp, 0, nums.length - 1);
    }

    private static void mergeSort(int[] nums, int[] temp, int left, int right) {
        if (left < right) {
            int center = (right + left) / 2;
            mergeSort(nums, temp, left, center);
            mergeSort(nums, temp, center + 1, right);
            merge(nums, temp, left, center + 1, right);
        }
    }

    private static void merge(int[] nums, int[] temp, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int temPos = leftPos;
        int size = rightEnd - leftPos + 1;
        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (nums[leftPos] <= nums[rightPos])
                temp[temPos++] = nums[leftPos++];
            else
                temp[temPos++] = nums[rightPos++];
        }
        while (leftPos <= leftEnd)
            temp[temPos++] = nums[leftPos++];
        while (rightPos <= rightEnd)
            temp[temPos++] = nums[rightPos++];
        for (int i = 0; i < size; i++, rightEnd--) {
            nums[rightEnd] = temp[rightEnd];
        }

    }
}
