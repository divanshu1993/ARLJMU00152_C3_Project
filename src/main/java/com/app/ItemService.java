package com.app;

import java.util.ArrayList;
import java.util.List;

public class ItemService {

    List<Item> itemList = new ArrayList<>();

    public Integer getTotalOrderAmount(List<String> items) {
        Integer totalAmount = 0;
        for (String itemName : items) {
            for (Item item: itemList) {
                if (item.getName().equals(itemName)) {
                    totalAmount+=item.getPrice();
                    break;
                }
            }
        }
        return totalAmount;
    }

    public void addItem(String itemName, Integer price) {
        itemList.add(new Item(itemName, price));
    }

}
