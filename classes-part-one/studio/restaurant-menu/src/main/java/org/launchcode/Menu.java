package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuList = new ArrayList<MenuItem>();
    private int numberOfItems = 0;
    private Date dateUpated = new Date();

    public Menu(){

    };

    public Menu(MenuItem newItem){
        menuList.add(newItem);
        Date current = new Date();
        dateUpated = current;
        numberOfItems++;
    }

    public MenuItem getById(int place){
        return menuList.get(place);
    }
    public void newItem (MenuItem newMenuItem){
        menuList.add(newMenuItem);
        Date current = new Date();
        dateUpated = current;
        numberOfItems++;
    }
    public void newItem(String aName, Double aPrice, String aDiscripton, String aCatagory, boolean aNewItem, Date newDate){
        MenuItem newMenuItem = new MenuItem(aName,aPrice,aDiscripton,aCatagory,aNewItem,newDate);
        menuList.add(newMenuItem);
        numberOfItems++;
    }

    public void deleteItem(int item){
        menuList.remove(item);
    }
    public String printByItem(int index){
        return menuList.get(index).toString();
    }
    @Override
    public String toString() {
        return "Menu{" +
                "menuList=" + menuList +
                ", dateUpated=" + dateUpated +
                '}';
    }
}
