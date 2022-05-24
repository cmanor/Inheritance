package org.example;

public abstract class Animal {

    private String name;

    public Animal(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(getName() + " eats");
    }

    public void sleep(){
        System.out.println(getName() + " sleeps");
    }
}
