package assignments;

public class Assignment10 {

	public static void main(String[] args) {

		int[] prices = { 7, 5, 4, 3, 2, 1 };

		int maxProfit = 0;
		int buyDay = 0;
		int sellDay = 0;

		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				int profit = prices[j] - prices[i]; // 18 -7 = 11;

				if (profit > maxProfit) { // 11>0
					maxProfit = profit;
					buyDay = i + 1; // day 1
					sellDay = j + 1;// day 2
				}

			}
		}
		if (maxProfit > 0) {
			System.out.println(" maxProfit is " + maxProfit);
			System.out.println("Buy the share on day " + buyDay);
			System.out.println("Sell the share on day " + sellDay);
		} else {
			System.out.println("You will loose your money, don't buy this share");
		}

	}

}
