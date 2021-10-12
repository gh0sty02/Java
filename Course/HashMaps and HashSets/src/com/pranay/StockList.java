package com.pranay;

import java.util.*;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item){
        if(item != null){
            StockItem inStock = list.getOrDefault(item.getName(), item);
            if(inStock != item){
                item.adjustStock(inStock.quantityInStock());
            }

            list.put(item.getName(), item);
            return item.quantityInStock();
        }

        return 0;

    }

    public int sellStock(String item, int quantity){
        StockItem inStock = list.getOrDefault(item, null);

        if((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0)  ){
            inStock.adjustStock(-quantity);
            return quantity;
        }

        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\n Stock list \n";
        double totalCost = 0;
        for(Map.Entry<String, StockItem> item: list.entrySet()){
            StockItem stockItem = item.getValue();

            s = s + stockItem.getName() + " : " + stockItem.getPrice() + " " ;
            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + "There are "+ stockItem.quantityInStock() + " items in the stock. value of items is : ";
            s += String.format("%.2f",itemValue) + " \n";
            totalCost += itemValue;
        }

        return s + " totalStock Value : " + String.format("%.2f",totalCost);
    }
}
