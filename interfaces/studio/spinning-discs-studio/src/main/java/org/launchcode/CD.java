package org.launchcode;

public class CD extends BaseDisc {
    public CD() {
    }

    public CD(String aName, String aType) {
        super(aName, aType);
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public String playDisc() {
        return "We are listening to music";
    }
    @Override
    public String spinDisc() {
        return "A CD spins at a rate of 200 - 500 rpm.";
    }
}