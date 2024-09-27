package org.launchcode;

import java.util.Objects;

public abstract class BaseDisc implements OpticalDisc{
    private String name;
    private String type;
    public BaseDisc(){}

    public BaseDisc(String aName, String aType){
        name = aName;
        type = aType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String spinDisc(){
        return "It's playing";
    }
    @Override
    public String playDisc(){
        return "It's spinning";
    }

    @Override
    public String toString() {
        return "This disc is a " + type + " with a name of " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseDisc that = (BaseDisc) o;
        return Objects.equals(name, that.name) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}
