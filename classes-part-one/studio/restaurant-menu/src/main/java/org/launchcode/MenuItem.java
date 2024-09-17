package org.launchcode;

import java.util.Date;

public class MenuItem {
    private Double price;
    private String name;
    private String discription;
    private String catagory;
    private boolean newItem;
    private Date dateAdded;

    public MenuItem(){

    }


    public MenuItem(String aName, Double aPrice, String aDiscripton, String aCatagory, boolean aNewItem, Date newDate){
        this.name = aName;
        this.price = aPrice;
        this.discription = aDiscripton;
        this.catagory = aCatagory;
        this.newItem = aNewItem;
        this.dateAdded = newDate;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setName(String aName){
        this.name = aName;
    }
    public void setPrice(double aPrice){
        this.price = aPrice;
    }

    public void setDiscription(String aDiscription){
        this.discription = aDiscription;
    }

    public void setCatagory(String aCatagory){
        this.catagory = aCatagory;
    }

    public void setNewItem(boolean aNewItem){
        this.newItem = aNewItem;
    }

    public String getName(){
        return this.name;
    }

    public Double getPrice(){
        return this.price;
    }

    public String getDiscription(){
        return this.discription;
    }

    public String getCatagory(){
        return this.catagory;
    }

    public boolean getNewItem(){
        return this.newItem;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name=" + name +
                ", price='" + price + '\'' +
                ", discription='" + discription + '\'' +
                ", catagory='" + catagory + '\'' +
                ", newItem=" + newItem +
                ", dateAdded=" + dateAdded +
                '}'  + System.lineSeparator();
    }
}
