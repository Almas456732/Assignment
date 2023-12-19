package com.company.professions;


public class Driver {
    String full_name;
    int experience;

    public Driver(String full_name, int experience) {
        this.full_name = full_name;
        this.experience = experience;
    }
    public Driver() {

    }
    @Override
    public String toString() {
        return full_name+ " " + experience ;
    }


}
