package org.launchcode;

public class MenuItem {
    private Double price;
    private String name;
    private String discription;
    private String catagory;
    private boolean newItem;

    public MenuItem(String aName, Double aPrice, String aDiscripton, String aCatagory, boolean aNewItem){
        this.name = aName;
        this.price = aPrice;
        this.discription = aDiscripton;
        this.catagory = aCatagory;
        this.newItem = aNewItem;
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
}
