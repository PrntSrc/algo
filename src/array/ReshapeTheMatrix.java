package array;
/*
leetcode no.561
 */
public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] nums = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        for (int[] x : matrixReshape(nums, 2, 6)) {
            for (int i : x)
                System.out.print(i + " ");
            System.out.println();
        }
    }

//    same row-traversing order
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if (r * c != n * m)
            return nums;
        else {
            int[][] res = new int[r][c];
            for (int i = 0; i < r * c; i++)
                res[i / c][i % c] = nums[i / m][i % m];
            return res;
        }
    }
}
