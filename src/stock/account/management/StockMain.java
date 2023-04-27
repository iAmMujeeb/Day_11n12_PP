package stock.account.management;

import java.util.Scanner;

public class StockMain {
    public static void main(String[] args) {
        Integer totalStockValue = 0;
        int temp = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Stocks = ");
        Integer numOfStocks = scanner.nextInt();
        for(int i=1; i<=numOfStocks; i++){
            switch (i){
                case 1:
                    StockPortfolio stockPortfolio = new StockPortfolio();
                    stockPortfolio.calculateStockValue();
                    temp = stockPortfolio.stockValue;
                    break;
                case 2:
                    StockPortfolio stockPortfolio1 = new StockPortfolio();
                    stockPortfolio1.calculateStockValue();
                    temp = stockPortfolio1.stockValue;
                    break;
                case 3:
                    StockPortfolio stockPortfolio2 = new StockPortfolio();
                    stockPortfolio2.calculateStockValue();
                    temp = stockPortfolio2.stockValue;
                    break;
                default:
                    System.out.println("Value Exceeded");
            }
            totalStockValue = totalStockValue + temp;
        }
        System.out.println("The Total Value of Stocks = "+totalStockValue);
    }
}