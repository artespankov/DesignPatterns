package Iterator;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        HousePancakeMenu housePancakeMenu = new HousePancakeMenu();
        HouseDinerMenu houseDinerMenu = new HouseDinerMenu();
        HouseCafeMenu houseCafeMenu = new HouseCafeMenu();
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(housePancakeMenu);
        menus.add(houseDinerMenu);
        menus.add(houseCafeMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
