package Iterator;

import java.util.Iterator;
import java.util.ArrayList;

public class HousePancakeMenu implements Menu{
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public HousePancakeMenu(){
        menuItems = new ArrayList<MenuItem>();
        addItem("K&B’s Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Made with blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with Waffles :)",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator(){
        return menuItems.iterator();
    }
}
