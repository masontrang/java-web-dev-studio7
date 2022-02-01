package org.launchcode.studio7;

public abstract class BaseDisc {

    private int storageCapacity;
    private String name;
    private String discType;


    public BaseDisc(int storageCapacity, String name, String discType) {
    }



    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

//    public double getThicknessMM() {
//        return thicknessMM;
//    }
//
//    public void setThicknessMM(double thicknessMM) {
//        this.thicknessMM = thicknessMM;
//    }
//
//    public double getDiameterMM() {
//        return diameterMM;
//    }
//
//    public void setDiameterMM(double diameterMM) {
//        this.diameterMM = diameterMM;
//    }

    public abstract void readWavelength();
    public abstract void writeData();
}
