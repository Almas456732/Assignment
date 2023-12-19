package com.company;

import com.company.professions.Driver;

public class Person {
     public String  full_Name;

    public Person(String full_Name) {
        this.full_Name = full_Name;
    }
    public class Driver extends Person {
        private int experience;

        public Driver(String full_Name, int experience) {
            super(full_Name);
            this.experience = experience;
        }

    }
}
