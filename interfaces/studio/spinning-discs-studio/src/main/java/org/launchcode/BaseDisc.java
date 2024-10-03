package org.launchcode;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String title;
    private double storageSize;
    private boolean reWritable;
    private int xSpeed;

//        private boolean isBlank;
//        private boolean runDefault;

    public BaseDisc(String aTitle, double aStorageSize, boolean aReWritable, int aXSpeed){

        title = aTitle;
        storageSize = aStorageSize;
        reWritable = aReWritable;
        xSpeed = aXSpeed;

    }
    // getters and setters

    public String getTitle() {
        return title;
    }

    public double getStorageSize() {
        return storageSize;
    }

    public boolean isReWritable() {
        return reWritable;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStorageSize(double storageSize) {
        this.storageSize = storageSize;
    }

    public void setReWritable(boolean reWritable) {
        this.reWritable = reWritable;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }



    // override to String

    @Override
    public String toString() {
        return "\n title: " + title +
                "\n storageSize: " + storageSize + " MB" +
                "\n reWritable: " + reWritable +
                "\n xSpeed: " + xSpeed ;
    }



}