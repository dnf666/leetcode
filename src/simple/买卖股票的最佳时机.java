package simple;

/**
 * created on 2019/11/11
 *
 * @author dailinfu
 */

public class 买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        if (prices.length == 1) {
            return 0;
        }
        int max = 0;
        return max(prices, max);

    }

    private int max(int[] prices, int max) {
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                max = max > profit ? max : profit;
            }

        }
        return max;
    }
}
