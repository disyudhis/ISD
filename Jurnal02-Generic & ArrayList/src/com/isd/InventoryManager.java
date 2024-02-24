package com.isd;

import java.util.ArrayList;

// Generic class
public class InventoryManager<T> {
    private ArrayList<T> inventoryList = new ArrayList<>();

    public void addItem(T item) {
        inventoryList.add(item);
    }

    public void removeItem(T item) {
        inventoryList.remove(item);
    }

    public void editItem(T oldItem, T newItem) {
        int index = inventoryList.indexOf(oldItem);
        if (index != -1) {
            inventoryList.set(index, newItem);
        }
    }

    public ArrayList<T> getInventoryList() {
        return inventoryList;
    }
}
