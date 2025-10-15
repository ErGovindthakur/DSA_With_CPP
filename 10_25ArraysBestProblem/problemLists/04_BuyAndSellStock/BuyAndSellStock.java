
class MaxProfit {

     int maxProfit(int[] arr) {
          if (arr.length < 2)
               return arr[0];
          int minPrice = arr[0];
          int profit = 0;
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] < minPrice) {
                    minPrice = arr[i];
               }

               profit = Math.max(profit, arr[i] - minPrice);
          }
          return profit;
     }
}

public class BuyAndSellStock {

     public static void main(String[] args) {
          MaxProfit mxp = new MaxProfit();
          int [] buyAndSellDays = {7,1,5,3,6,4};
          int profitPrice = mxp.maxProfit(buyAndSellDays);

          System.out.println("Max profit Price -> "+ profitPrice);
     }
}