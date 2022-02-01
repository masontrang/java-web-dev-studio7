package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD(700,"Spider Man", "CDROM");
        DVD dvd = new DVD(8000,"Spider Man", "DVD");
        VinylRecord record = new VinylRecord(40, "Rocket", "Vinyl Record");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        cd.readWavelength();
        cd.writeData();

        dvd.spinDisc();
        dvd.readWavelength();
        dvd.writeData();

        record.spinDisc();
        record.readWavelength();
        record.writeData();


    }
}
