package org.launchcode.studio7;

public class VinylRecord extends BaseDisc implements OpticalDisc{
    public VinylRecord(int storageCapacity, String name, String discType) {
        super(storageCapacity, name, discType);
    }

    @Override
    public void readWavelength() {
        System.out.println("Wavelength of 200nm");
    }

    @Override
    public void writeData() {
        System.out.println("Read mechanism at 45Kib/s");
    }

    @Override
    public void spinDisc() {
        System.out.println("Vinyl spinning at 50rpm");
    }
}
