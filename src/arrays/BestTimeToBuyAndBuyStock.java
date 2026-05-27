package arrays;

public class BestTimeToBuyAndBuyStock {
	public static int buyAndSellStock(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		int n = prices.length;
		
		for(int i=0; i<n; i++) {
			if(prices[i] < minPrice) {
				minPrice = prices[i];
			}
			else {
				int profit = prices[i] - minPrice;
				maxProfit = Math.max(maxProfit, profit);
			}
		}
		
		return maxProfit;
	}
	
	public static void main(String[] args) {
		int []arr = {7,1,5,3,6,4};
		
		System.out.println(buyAndSellStock(arr));
	}
}
