package com.kodilla.execution_model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public Item getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return this.items.get(index);
        }
        return null;
    }

    public void clear() {
        this.items.clear();
    }

    public int getSize() {
        return this.items.size();
    }
}
