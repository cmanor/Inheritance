package org.example;

public class Teacher extends Person {

    private int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        setSalary(salary);

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return this.getName() + "\n" + this.getAddress()+ "\n"
                + "salary " + this.getSalary() + " euro/month";
    }
}
