package org.example.labs.lab3.Iterator;

import java.util.List;

public class TreasureChestItemIterator implements Iterator<Item> {
    private final TreasureChest chest;
    private final ItemType type;

    private int index;

    public TreasureChestItemIterator(TreasureChest chest, ItemType type) {
        this.chest = chest;
        this.type = type;
        this.index = -1;
    }

    private int findNextIndex() {
        List<Item> items = chest.getItems();
        int tempIndex = index;
        while (true) {
            tempIndex++;
            if(tempIndex >= items.size()) {
                tempIndex = -1;
                break;
            }
            if (type.equals(ItemType.ANY) || items.get(tempIndex).getType().equals(type)) {
                break;
            }
        }
        return tempIndex;
    }

    public boolean hasNext() { return -1 != findNextIndex(); }

    public Item next() {
        index = findNextIndex();
        if (index != -1) {
            return chest.getItems().get(index);
        }
        return null;
    }
}
