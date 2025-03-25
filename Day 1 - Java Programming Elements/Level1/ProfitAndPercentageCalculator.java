public class ProfitAndPercentageCalculator {
    public static void main(String[] args) {
        int CostPrice = 129;
        int SellingPrice = 191;
        int Profit = SellingPrice - CostPrice;
        double ProfitPercentage = (Profit / (double) CostPrice) * 100;
        System.out.println("The Cost Price is INR " + CostPrice + " and Selling Price is INR " + SellingPrice +
                "\nProfit is INR " + Profit +
                "\nProfit Percentage is " + ProfitPercentage + "%");
    }
}
