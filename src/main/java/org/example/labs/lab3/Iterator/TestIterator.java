package org.example.labs.lab3.Iterator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestIterator {
    @Test
    public void testItem() {
        Item item = new Item(ItemType.RING, "Ring of power");
        assertEquals("Ring of power", item.toString());
        assertEquals(ItemType.RING, item.getType());
    }

    @Test
    public void testChest() {
        TreasureChestItemIterator iterator = new TreasureChestItemIterator(new TreasureChest(), ItemType.POTION);
        assertTrue(iterator.hasNext());
        Item item = iterator.next();
        assertEquals("Potion of courage", item.toString());
    }
}
