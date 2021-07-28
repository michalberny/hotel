package com.engeto.examples.hotel;

public class Rooms {
    //Attributes of class
    private int roomNumber;         //Number of room
    private int numberOfBeds;       //Number of beds
    private boolean hasBalcony;     //Is there a balcony in the room? True/False
    private boolean hasSeaView;     //Is there a sea view from the room? True/False
    private int price;              //Price per night

    //Constructor
    public Rooms(int roomNumber, int numberOfBeds, boolean hasBalcony, boolean hasSeaView, int price) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;
        this.price = price;
    }

    //Method to get desciption of newly created objects
    public void getDescription() {
        System.out.println("Číslo pokoje: " + roomNumber + " Počet postelí: " + numberOfBeds + " Balkón: "
                + hasBalcony + " Výhled na moře: "+ hasSeaView + " -> Cena za noc: " + price + "Kč");
    }

    //Getters
    public int getRoomNumber() { return roomNumber; }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public boolean isHasSeaView() {
        return hasSeaView;
    }

    public int getPrice() {
        return price;
    }

    //Setters
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}
