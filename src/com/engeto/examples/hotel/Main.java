package com.engeto.examples.hotel;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //Create new objects from Guests class
        Guests adela = new Guests("Adéla","Malíková", LocalDate.of(1993, 3, 13));
        Guests jan = new Guests("Jan","Dvořáček", LocalDate.of(1995, 5, 5));

        //Get description of objects adela, jan
        adela.getDescription();
        jan.getDescription();
        System.out.println();

        //Create new objects from Rooms class
        Rooms roomOne = new Rooms(1, 1, true, true, 1000);
        Rooms roomTwo = new Rooms(2, 1, true, true, 1000);
        Rooms roomThree = new Rooms(3, 3, false, true, 2400);

        //Get description of objects roomOne, roomTwo, roomThree
        roomOne.getDescription();
        System.out.println();
        roomThree.getDescription();

        //Create new object from Bookings class
        System.out.println();
        Bookings bookings = new Bookings();
        //Create new objects from Booking class
        Booking reservation = new Booking(adela, roomOne,
                LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26)
                , TypeOfStay.TOURISM);
        bookings.addBooking(reservation);  //Add object to bookings ArrayList

        reservation = new Booking(adela, roomThree,
                LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14)
                , TypeOfStay.WORK, jan);
        bookings.addBooking(reservation);   //Add object to bookings ArrayList

        bookings.printBookings();   //Print out all elements from bookings ArrayList


    }
}
