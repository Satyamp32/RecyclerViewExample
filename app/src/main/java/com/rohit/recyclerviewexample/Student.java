package com.rohit.recyclerviewexample;

public class Student {

    String name;
    String address;
    int roll;


    public Student(String name, String address, int roll) {
        this.name = name;
        this.address = address;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
