package org.launchcode.studio7;

public interface OpticalDisc {
    public static final double THICKNESSMM = 1.2;
    public static final double DIAMETER = 120;
    public static final double MAXSPIN = 10;

    default void something(){
        double diameterSquare = DIAMETER*DIAMETER;
    }

    default void spinMax(){

    }

    public void spinDisc();
}
