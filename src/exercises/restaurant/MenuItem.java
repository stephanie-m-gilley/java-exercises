package exercises.restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class MenuItem {

    private String name;
    private double price;
    private String description;
    private Category category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, Category category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "Menu Items " +
                "Item Name: " + name + '\'' +
                ", Item Price: " + price +
                ", Item description: " + description + '\'' +
                ", Item Category: " + category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 &&
                isNew == menuItem.isNew &&
                Objects.equals(name, menuItem.name) &&
                Objects.equals(description, menuItem.description) &&
                category == menuItem.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description, category, isNew);
    }
}
