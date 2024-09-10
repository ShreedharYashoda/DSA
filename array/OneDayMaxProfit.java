/* Leetcode 121
	You are given an array prices where prices[i] is the price of a given stock on the ith day.

	You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

	Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

*/

class OneDayMaxProfit{
	//Brute force  O(n^2) 
	public int maxProfit(int[] prices) {
		int maxProfit = 0;

		for(int i=0; i<prices.length-1; i++){
			for(int j=i+1; j<prices.length; j++){
				maxProfit = Math.max(maxProfit, prices[j] -prices[i]);
			}
		}
		return maxProfit;
	}

	// Lineara time complexity O(n)
	public int maxProfit2(int[] prices) {
		int maxProfit = 0;
		int min = prices[0];
		for(int i=1; i<prices.length; i++){
		   int profit = prices[i] - min;
		   maxProfit  = Math.max(maxProfit, profit);
		   min = Math.min(min, prices[i]);
		}
		return maxProfit;
	}
}