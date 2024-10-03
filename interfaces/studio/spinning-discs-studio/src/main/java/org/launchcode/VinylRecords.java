package org.launchcode;

public class VinylRecords extends BaseDisc implements OpticalDisc{
    public VinylRecords(String aTitle, double aStorageSize, boolean aReWritable, int aXSpeed) {
        super(aTitle, aStorageSize, aReWritable, aXSpeed);


    }


    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public double dataTransferRate() {
        return 0;
    }

//    @Override
//    public double dataTransferRate() {
//
//        return this.getSeqSpeed() * this.getxSpeed();
//    }

    @Override
    public void writeData() {
        System.out.println("Writing data to CD using laser");
    }

    @Override
    public void readData() {
        System.out.println("Reading data from CD using laser");
    }

    @Override
    public void reportInfo() {
        System.out.println("\n CD: \n" + this);
    }
}