package org.launchcode;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem bkClassic = new MenuItem(13.00, "BK CLASSIC","Main", true);
        MenuItem truffleFries = new MenuItem(9.00, "Truffle Parmesan Hand-Cut Fries","App", false);
        MenuItem theBoss = new MenuItem(9.50, "The Boss","Dessert", true);

        Menu menu = new Menu();

        menu.addItem(bkClassic);
        menu.addItem(truffleFries);
        menu.addItem(theBoss);

        //what if I try to add bkClassic again?
        menu.addItem(bkClassic);

        System.out.println("/nFull Menu");
        menu.printMenu();

        System.out.println("/nSingle Menu Item:");
        menu.printMenuItem((truffleFries));

        menu.removeItem(truffleFries);

        System.out.println("/nUpdated Menu");
        menu.printMenu();
    }
}
