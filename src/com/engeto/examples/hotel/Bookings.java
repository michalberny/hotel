package com.engeto.examples.hotel;

import java.util.ArrayList;

public class Bookings {
    ArrayList<Booking> bookings = new ArrayList<>();    //Create ArrayList from Bookings class

    //Method to add new elements to bookings ArrayList
    public void addBooking(Booking newBooking) {
        bookings.add(newBooking);
    }

    //Method to print all bookings ArrayList elements using foreach loop
    public void printBookings() {
        for (Booking booking : bookings) {
            System.out.println(booking.getDescription());
        }
    }
}
