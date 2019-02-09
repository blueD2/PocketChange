package io.github.elenigeorgiou.pocketchange;

import java.util.*;
import java.lang.*;
import java.net.*;

public class ListItem {
    /*
     * String name (name of the event/item)
     * String description (a  provided description of the event)
     * int price (0 for free, 1 for $, 2 for $$, 3 for $$$)
     * int category (0 - don't care, 1 - food, 2 - media, 3 - outdoor)
     * URL url (a url to the restaurant or event)
     * Date expireDate (a date time event, can be indefinite)
     * String location (where the event is)
     */
    private String name;
    private String description;
    private int price; // 0 - free, 1 - $, 2 - $$, 3 - $$$
    private int category; // 0 - don't care, 1 - food, 2 - media, 3 - outdoors
    private URL url;
    private Date expireDate; // can be indefinite if necessary
    private String location; // can maybe be changed later

    public ListItem(String name) { this.name = name; }

    private void setDescription(String description) { this.description = description; }

    private void setPrice(int price) { this.price = price; }

    private void setCategory(int category) { this.category = category; }

    private void setUrl(URL url) { this.url = url; }

    private void setExpireDate(Date expireDate) { this.expireDate = expireDate; }

    private void setLocation(String location) { this.location = location; }

    private String getName() { return name; }

    private String getDescription() { return description; }

    private int getPrice() { return price; }

    private int getCategory() { return category; }

    private URL getUrl() { return url; }

    private Date getExpireDate() { return expireDate; }

    private String getLocation() { return location; }
}