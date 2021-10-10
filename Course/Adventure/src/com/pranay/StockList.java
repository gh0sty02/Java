package com.pranay;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new HashMap<>();
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

    public StockItem get(String name){
        return this.get(name);
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

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + ". There are :"+ stockItem.quantityInStock() + " items in the stock. value of items is : ";
            s += itemValue + " \n";
            totalCost += itemValue;
        }

        return s + " totalStock Value : " + totalCost;
    }
}
