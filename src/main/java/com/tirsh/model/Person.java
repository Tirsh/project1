package com.tirsh.model;

import java.time.LocalDate;

public class Person {
    private int personId;
    private String name;
    private LocalDate birthday;

    public Person() {
    }

    public Person(int id, String name, LocalDate birthday) {
        this.personId = id;
        this.name = name;
        this.birthday = birthday;
    }

    public int getId() {
        return personId;
    }

    public void setId(int id) {
        this.personId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}