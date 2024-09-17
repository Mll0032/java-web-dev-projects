package org.launchcode;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public Menu() {
        items = new ArrayList<>();
        lastUpdated = new Date();
    }

    public void addItem(MenuItem item) {
        items.add(item);
        lastUpdated = new Date();
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
        lastUpdated = new Date();
    }

    public void printMenu() {
        System.out.println("Menu (last updated: " + lastUpdated + ")");
        for (MenuItem item : items) {
            System.out.println(item);
        }
    }

    public void printMenuItem() {
        if (value.contains value;)
        System.out.println("Menu Item" + items);
        for (MenuItem item : items) {
            System.out.println(item);
        }
    }
}

//
