package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String name, int capacity, String[] contents, String discType, String readType) {
        super(name, capacity, contents, discType, readType);
    }

    @Override
    public void spinDisc() {
        System.out.println("Spinning the disc");
    }

    @Override
    public void storeData() {
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
