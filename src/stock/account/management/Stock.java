package stock.account.management;

public class Stock {
    private String stockName;
    private int numOfShares;
    private int sharePrice;
    private int stockValue;

    public Stock(String stockName, int numOfShares, int sharePrice, int stockValue) {
        this.stockName = stockName;
        this.numOfShares = numOfShares;
        this.sharePrice = sharePrice;
        this.stockValue = stockValue;
    }

    public Stock() {
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumOfShares() {
        return numOfShares;
    }

    public void setNumOfShares(int numOfShares) {
        this.numOfShares = numOfShares;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getStockValue() {
        return stockValue;
    }

    public void setStockValue(int stockValue) {
        this.stockValue = stockValue;
    }
}
