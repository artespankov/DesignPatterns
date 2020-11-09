package Composite;

public class MenuTestDrive {
    public static void main(String[] args){
        MenuComponent housePancakeMenu = new Menu("HOUSE PANCAKE MENU", "Breakfast");
        MenuComponent houseDinerMenu = new Menu("HOUSE DINER MENU", "Lunch");
        MenuComponent houseCafeMenu = new Menu("HOUSE CAFE MENU", "Dinner");
        MenuComponent houseDessertMenu = new Menu("HOUSE DESSERT MENU", "Dessert");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(housePancakeMenu);
        allMenus.add(houseDinerMenu);
        allMenus.add(houseCafeMenu);

        houseDinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce",
                true,
                3.89
        ));
        houseDinerMenu.add(houseDessertMenu);
        houseDessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true,
                1.59
        ));

        Waitress waitress = new Waitress(allMenus);
//        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
