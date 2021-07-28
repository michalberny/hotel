package com.engeto.examples.hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Guests {
    //Attributes of class
    private String forename;    //Forename of guest
    private String surname;     //Surename of guest
    private LocalDate birth;    //Birth of guest

    //Constuctor
    public Guests(String forename, String surname, LocalDate birth) {
        this.forename = forename;
        this.surname = surname;
        this.birth = birth;
    }

    //Getters
    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirth() {
        return birth;
    }

    //Setters
    public void setForename(String forename) {
        this.forename = forename;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    //Get FullName method
    public String getFullName() { return getForename() +" " + getSurname(); }

    //Get description of the object in Guests class
    public void getDescription() {
        String formattedDate = birth.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Jméno: " + forename + " Příjmení: " + surname + " Datum narození: " + formattedDate);
    }


}
