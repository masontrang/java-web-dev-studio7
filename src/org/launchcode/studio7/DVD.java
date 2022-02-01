package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(int storageCapacity, String name, String discType) {
        super(storageCapacity, name, discType);
    }
    // TODO: Implement your custom interface.

    @Override
    public void spinMax() {
        double currentSpin=0;
        if(MAXSPIN > currentSpin){

        };
    }

    @Override
    public void readWavelength() {
        System.out.println("Wavelength of 650nm");
    }

    @Override
    public void writeData() {
        System.out.println("Read mechanism at 10.5 Mbit/s");
    }

    @Override
    public void spinDisc() {
        System.out.println("DVD spinning at 1500rpm");

    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
