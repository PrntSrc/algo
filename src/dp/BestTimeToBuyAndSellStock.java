package dp;

/**
 * Created by Yue on 2017/10/15.
 * leetcode no.121
 */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = new int[] {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int min = prices[0], max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > min)
                max = Math.max(max, prices[i] - min);
            else
                min = prices[i];
        }
        return max;
    }
}
