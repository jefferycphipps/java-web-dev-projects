package org.launchcode;

public class DVD extends BaseDisc {
    // TODO: Implement your custom interface.
    public DVD(){}

    public DVD(String aName, String aType){
        super(aName, aType);
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    @Override
    public String playDisc(){
        return "We are watching a movie";
    }
    @Override
    public String spinDisc(){
        return "A DVD spins at a rate of 570 - 1600 rpm.";
    }


}
