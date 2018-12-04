package exercises.restaurant;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Menu {

    private List<MenuItem> menuItems;
    private LocalDate lastUpdatedDate;


    public Menu() {
        lastUpdatedDate = LocalDate.now();
        this.menuItems = new ArrayList<>();
    }

    public boolean addItem(MenuItem menuItem) {
        menuItem.setNew(true);
        lastUpdatedDate = LocalDate.now();
        return menuItems.add(menuItem);

    }

    public boolean removeItem(MenuItem menuItem) {

        lastUpdatedDate = LocalDate.now();
        return menuItems.remove(menuItem);
    }


    @Override
    public String toString() {
        return "Menu: " +
                "Menu Items: " + menuItems +
                ", Last Updated " + lastUpdatedDate;
    }

}
