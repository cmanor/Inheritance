package org.example;

import java.util.ArrayList;

public class Person {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public Person(String name, String address) {
        setAddress(address);
        setName(name);
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
    @Override
    public String toString(){
        return this.getName() + "\n" + this.getAddress();
    }
}
