package com.pranay;

public class Main {
    private final static StockList stockList = new StockList();
    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.6, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

System.out.println(stockList);

        Basket myBasket = new Basket("Pranay");
        sellStock(myBasket, "car", 2);
        sellStock(myBasket, "bs", 2);

        System.out.println(myBasket);

      System.out.println(stockList);


    }

    public static int sellStock(Basket basket, String item, int quantity){
        StockItem existingItem = stockList.get(item);
        if(existingItem == null){
            System.out.println("We dont sell " + item + " here");
            return 0;
        }

        if (stockList.sellStock(item, quantity) != 0){
            basket.addToBasket(existingItem, quantity);
            return quantity;
        }

        return 0;
    }
}
