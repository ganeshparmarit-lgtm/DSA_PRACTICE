/*
 * Problem: Best Time to Buy and Sell Stock
 * Approach: Track minimum price
 * TC: O(n) | SC: O(1)
 */

package Arrays;

public class StockBuySell {
    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0]; // sabse sasta din
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i]; // sasta mila → update karo
            } else {
                int currentProfit = prices[i] - buyPrice;
                profit = Math.max(profit, currentProfit); // max profit update karo
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + maxProfit(prices));
    }
}
