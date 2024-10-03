package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {

    private final double seqSpeed;
    private boolean dualLayer;

    public DVD(String aTitle, double aStorageSize, boolean aReWritable, int aXSpeed,boolean dualLayer) {
        super(aTitle, aStorageSize, aReWritable, aXSpeed);

        seqSpeed = 1385.0;//Kbps

    }

    public boolean isDualLayer() {
        return dualLayer;
    }

    public void setDualLayer(boolean dualLayer) {
        this.dualLayer = dualLayer;
    }

    public double getSeqSpeed() {
        return seqSpeed;
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public double dataTransferRate() {
        return this.getSeqSpeed() * this.getxSpeed();
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to DVD using laser");
    }

    @Override
    public void readData() {
        System.out.println("Reading data from DVD using laser");
    }

    @Override
    public void reportInfo() {
        System.out.println("\n DVD: \n" + this);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}