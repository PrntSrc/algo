package greedy;

/**
 * leetcode no.455
 */

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = new int[] {1, 2};
        int[] s = new int[] {1, 2, 3};
        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        int child = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int cookie = 0; child < g.length && cookie < s.length; cookie++) {
            if (g[child] <= s[cookie]) {
                child++;
            }
        }
        return child;
    }
}
