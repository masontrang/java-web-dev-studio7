package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(int storageCapacity, String name, String discType){
        super(storageCapacity, name, discType);
    }

    // TODO: Implement your custom interface.
    @Override
    public void readWavelength() {
        System.out.println("Wavelength of 780nm");
    }

    @Override
    public void writeData() {
        System.out.println("Read mechanism at 1200Kib/s");
    }

    @Override
    public void spinDisc() {
        System.out.println("CD spinning at 400rpm");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
