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

    public Map<StockItem, Integer> getItems(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "Basket of "+ this.name + " contains " + list.size() + (list.size() == 1 ? " item" : " items") +
                "\n";
        double cost = 0;
        for(Map.Entry<StockItem, Integer> item: list.entrySet()){
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            cost += item.getKey().getPrice() * item.getValue();
            s = s + " total "+ cost;
        }

        return s;
    }
}
