package com.example.gymmanagement;

public class birth_day_recycler_represents {

    //fields
    private String name;
    private String surname;
    private String ph_no;
    private String dob;

    //making a normal function for call //creating a constructor with none

    public birth_day_recycler_represents() {
    }


    //constructor

    public birth_day_recycler_represents(String name, String surname, String ph_no, String dob) {
        this.name = name;
        this.surname = surname;
        this.ph_no = ph_no;
        this.dob = dob;
    }


//    making getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPh_no() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
