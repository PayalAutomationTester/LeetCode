package EasyPrograms;

public class BuySellStock_121 {

	public static void main(String[] args) {

		int[] prices = { 2, 6, 4, 3, 1 };
		int maxProfit = maxProfit(prices);
		System.out.println("Max Profit is : " + maxProfit);

	}

	public static int maxProfit(int[] prices) {
		int min = prices[0];
		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < min) {

				min = prices[i];
			} else if (prices[i] - min > maxProfit) {

				maxProfit = prices[i] - min;

			}
		}
		return maxProfit;
	}

}
