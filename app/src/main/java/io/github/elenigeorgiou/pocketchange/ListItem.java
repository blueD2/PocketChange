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

    public void setDescription(String description) { this.description = description; }
    public void setPrice(int price) { this.price = price; }
    public void setCategory(int category) { this.category = category; }
    public void setUrl(URL url) { this.url = url; }
    public void setExpireDate(Date expireDate) { this.expireDate = expireDate; }
    public void setLocation(String location) { this.location = location; }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getPrice() { return price; }
    public int getCategory() { return category; }
    public URL getUrl() { return url; }
    public Date getExpireDate() { return expireDate; }
    public String getLocation() { return location; }
}