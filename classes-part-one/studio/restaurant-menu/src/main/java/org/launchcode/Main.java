package org.launchcode;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Date date = new Date();
        Menu newMenu = new Menu();
        MenuItem newerItem = new MenuItem("Pizza", 12.99, "Its pizza.", "Main", true, date );
        newMenu.newItem(newerItem);
        newMenu.newItem("Chicken", 17.99, "Cluck", "App", true, date);
        System.out.println("First menu: " + newMenu.toString());
        newMenu.deleteItem(0);
        System.out.println("Second menu: " + newMenu);
        System.out.println(newMenu.printByItem(0));

    }
}
