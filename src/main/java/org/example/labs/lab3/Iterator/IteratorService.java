package org.example.labs.lab3.Iterator;

import java.util.List;

public class IteratorService {
    private List<Item> items;
    private ItemType itemType;

    public void execute() {
        TreasureChest chest = new TreasureChest();
        for (ItemType itemType : ItemType.values()) {
            System.out.println(itemType + ":");
            Iterator<Item> iterator = chest.iterator(itemType);

            while(iterator.hasNext()) {
                Item item = iterator.next();
                System.out.println(item.toString());
            }
            System.out.println();
        }
    }
}
