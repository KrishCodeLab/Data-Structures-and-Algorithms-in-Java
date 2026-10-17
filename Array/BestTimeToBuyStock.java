public class BestTimeToBuyStock {
  public static void main(String[] args) {
    /*
     * You are given an array prices where prices is the price of given stock on the
     * ith day.You want to maximize your profit by choosing
     * a single day to buy one stock and selling on different day. Returns the
     * maximum profit you can achieve from this transaction.
     * If you can't generate any profit return 0.
     */

    // Stock prices for each day
    int price[] = { 7, 1, 5, 3, 6, 4 };

    // Stores the maximum profit found so far
    int max_profit = 0;

    // Assume the first day's price is the minimum buying price
    int Buy_price = price[0];

    // Traverse the array to check each day's stock price
    for (int i = 0; i < price.length; i++) {

      // Get the stock price for the current day
      int current_price = price[i];

      // If today's price is greater than the buying price,
      // calculate the profit from selling today
      if (Buy_price < current_price) {

        // Calculate profit = selling price - buying price
        int curr_profit = current_price - Buy_price;

        // Update maximum profit only if the current profit is greater
        max_profit = Math.max(max_profit, curr_profit);

      } else {

        // If today's price is lower than or equal to the buying price,
        // update the minimum buying price
        Buy_price = current_price;
      }
    }

    // Print the maximum profit possible
    System.out.println(max_profit);
  }
}
