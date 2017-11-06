package com.example.vcarve_dt_14.task_5masterdetailflowfinal.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {

        addItem(new DummyItem("Electronics", "Laptops"));
        addItem(new DummyItem("Entertainment", "Video Games"));
        addItem(new DummyItem("Fashion", "Mens"));
        addItem(new DummyItem("Sports", "Equipment"));
        addItem(new DummyItem("Books", "Sci-Fi"));
        addItem(new DummyItem("Automobile", "Accessories"));
        addItem(new DummyItem("Interior Design", "Paints"));
        addItem(new DummyItem("Health", "Medicines"));
        addItem(new DummyItem("Kitchen", "Cookware"));
        addItem(new DummyItem("Furniture", "Beds"));
        addItem(new DummyItem("Garden", "Accessories"));
        // Add some sample items.

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.content, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "position");
    }


    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {

        public final String content;
        public final String details;


        public DummyItem(String content, String details) {

            this.content = content;
            this.details = details;


        }

        @Override
        public String toString() {
            return content;

        }
    }
}
