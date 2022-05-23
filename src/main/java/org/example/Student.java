package org.example;

import org.w3c.dom.ls.LSOutput;

public class Student extends Person {

    private int credits;
    public Student(String name, String address) {
        super(name, address);
        setCredits(0);
    }

    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void study(){
        setCredits(getCredits()+1);
    }

    @Override
    public String toString(){
        return this.getName() + "\n" + this.getAddress()+ "\n"
                + "Study credits " + this.getCredits();
    }
}
