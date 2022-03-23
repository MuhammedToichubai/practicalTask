package com.company.model;

import com.company.exceptions.InvalidIdExceptions;
import com.company.gender.Gender;

public class User {
    private String name;
    private int age;
    private int id;
    private Gender gender;

    public User() {
    }

    public User(String name, int age, int id, Gender gender) throws InvalidIdExceptions {
        this.name = name;
        this.age = age;
        try {
            this.id = id;
        } catch (InvalidIdExceptions e){
            System.out.println(e.getMessage());
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User: " +
                "name : " + name +
                ", age : " + age +
                ", id : " + id +
                gender;
    }
}

