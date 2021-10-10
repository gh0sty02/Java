package com.pranay;

import java.util.*;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name){
        this.name = name;
        this.list = new HashMap<>();
    }

    public int addToBasket(StockItem item, int quantity){
        if((item != null) && quantity > 0){
            int foundItem = list.getOrDefault(item, 0);
            list.put(item, foundItem + quantity);
            return foundItem;
        }
        return 0;
    }
}
