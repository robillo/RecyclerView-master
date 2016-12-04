package com.appbusters.robinkamboj.myfirstlibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by robinkamboj on 04/12/16.
 */

public class RSSFeedProvider {
    public static List<RSSItem> parse(String rssFeed) {
        List<RSSItem> list = new ArrayList<>();
        Random r = new Random();
        // random number of item but at least 5
        Integer number = r.nextInt(10) + 5;
        for (int i = 0; i < number; i++) {
            // create sample data
            String s = String.valueOf(r.nextInt(1000));
            RSSItem item = new RSSItem("Summary " + s, "Description " + s);
            list.add(item);
        }
        return list;
    }
}