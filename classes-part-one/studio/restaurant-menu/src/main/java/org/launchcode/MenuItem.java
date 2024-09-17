package org.launchcode;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private Date dateAdded;

    //MenuItem bkClassic = new MenyItem(13.00, "BK Classic", "Main", true);

    public MenuItem(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.dateAdded = new Date();
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
        this.dateAdded = new Date();
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public boolean isNew() {

        return isNew;
    }

    public void setNew(boolean aNew) {

        isNew = aNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(price, menuItem.price) == 0 &&
                isNew == menuItem.isNew && Objects.equals(description, menuItem.description) &&
                Objects.equals(category, menuItem.category) && Objects.equals(dateAdded, menuItem.dateAdded);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                ", dateAdded=" + dateAdded +
                '}';
    }
}



