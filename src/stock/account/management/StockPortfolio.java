package stock.account.management;

import java.util.Scanner;

public class StockPortfolio {
    Integer stockValue = 0;
    Integer sharePrice;

    public void calculateStockValue(){
        Stock stock = new Stock();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name of Stock = ");
        String stockName = scanner.next();
        System.out.print("Enter Number of Shares = ");
        Integer numOfShares = scanner.nextInt();
        for (int i=1; i<=numOfShares; i++){
            System.out.println("Enter Price of Share = ");
            sharePrice = scanner.nextInt();
            stockValue = stockValue + sharePrice;

        }
        System.out.println("Total Value of Single Stock = "+stockValue);
        stock.setStockName(stockName);
        stock.setNumOfShares(numOfShares);
        stock.setSharePrice(sharePrice);
        stock.setStockValue(stockValue);
    }
}
