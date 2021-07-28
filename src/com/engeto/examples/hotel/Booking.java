package com.engeto.examples.hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Booking {
    //Attributes of class
    Guests guest;                           //guest from Guests class
    Rooms room;                             //room from Rooms class
    private LocalDate beginOfStay = LocalDate.now();                      //Beginning of the stay
    private LocalDate endOfStay = LocalDate.now().plusDays(7);            //Ending of the stay
    TypeOfStay stay;                        //Enum TOURISM,WORK
    Guests otherGuests;                     //otherGuests from Guests class

    //Constructor with otherGuests attribute
    public Booking(Guests guest, Rooms room, LocalDate beginOfStay, LocalDate endOfStay, TypeOfStay stay, Guests otherGuests) {
        this.guest = guest;
        this.room = room;
        this.beginOfStay = beginOfStay;
        this.endOfStay = endOfStay;
        this.stay = stay;
        this.otherGuests = otherGuests;
    }

    //Constructor without otherGuests attribute
    public Booking(Guests guest, Rooms room, LocalDate beginOfStay, LocalDate endOfStay, TypeOfStay stay) {
        this.guest = guest;
        this.room = room;
        this.beginOfStay = beginOfStay;
        this.endOfStay = endOfStay;
        this.stay = stay;
    }

    //Constructor without definition of LocalDate
    public Booking(Guests guest, Rooms room, TypeOfStay stay) {
        this.guest = guest;
        this.room = room;
        this.stay = stay;
    }

    //Constructor without definition of LocalDate + otherGuests
    public Booking(Guests guest, Rooms room, TypeOfStay stay, Guests otherGuests) {
        this.guest = guest;
        this.room = room;
        this.stay = stay;
        this.otherGuests = otherGuests;
    }

    //Method to get description of objects from Booking class
    public String getDescription() {
        String result;

        //Edit output of LocalDate variables
        String formattedBeginOfStay = beginOfStay.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String formattedEndOfStay = endOfStay.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));

        //If the otherGuest attribute is empty, write this:
        if (otherGuests == null) {
            result = "Booking na jméno: " + guest.getFullName() + " Číslo pokoje: " + room.getRoomNumber() + " Od: "
                    + formattedBeginOfStay + " Do: " + formattedEndOfStay + " Typ pobytu: " + stay;
        }

        //Otherwise write this:
        else {
            result = ("Booking na jméno: " + guest.getFullName() + " Číslo pokoje: " + room.getRoomNumber() + " Od: "
                    + formattedBeginOfStay + " Do: " + formattedEndOfStay + " Typ pobytu: " + stay + " Další hosté: " +
                    otherGuests.getFullName());
        }
        return result;
    }

    //Getters
    public Guests getGuest() {
        return guest;
    }

    public Rooms getRoom() {
        return room;
    }

    public LocalDate getBeginOfStay() {
        return beginOfStay;
    }

    public LocalDate getEndOfStay() {
        return endOfStay;
    }

    public TypeOfStay getStay() {
        return stay;
    }

    public Guests getOtherGuests() {
        return otherGuests;
    }

    //Setters
    public void setGuest(Guests guest) {
        this.guest = guest;
    }

    public void setRoom(Rooms room) {
        this.room = room;
    }

    public void setBeginOfStay(LocalDate beginOfStay) {
        this.beginOfStay = beginOfStay;
    }

    public void setEndOfStay(LocalDate endOfStay) {
        this.endOfStay = endOfStay;
    }

    public void setStay(TypeOfStay stay) {
        this.stay = stay;
    }

    public void setOtherGuests(Guests otherGuests) {
        this.otherGuests = otherGuests;
    }


}
