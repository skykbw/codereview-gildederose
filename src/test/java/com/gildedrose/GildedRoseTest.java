package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    public void should_be_nothing_when_no_item(){
        Item[] items = new Item[]{};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQualityItems();

        assertEquals(0,items.length);
    }

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQualityItems();
        assertEquals("foo", app.items[0].name);
    }

}
