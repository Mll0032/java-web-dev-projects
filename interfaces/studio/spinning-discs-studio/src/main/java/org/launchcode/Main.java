package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cdObject = new CD("Song Playlist",65, true,2);
        DVD dvdObject = new DVD("Movie collection", 4707,false,4,true);

        // TODO: Call each CD and DVD method to verify that they work as expected.


        // System.out.println("\n CD: \n" + cdObject);
        cdObject.reportInfo();
        cdObject.spinDisc();
        System.out.println("Data transfer rate of this "+cdObject.getTitle() +":"+ cdObject.dataTransferRate());

        System.out.println("\n DVD: \n" + dvdObject);
        dvdObject.spinDisc();
        System.out.println("Data transfer rate of this "+dvdObject.getTitle() +":"+ dvdObject.dataTransferRate());


    }
}