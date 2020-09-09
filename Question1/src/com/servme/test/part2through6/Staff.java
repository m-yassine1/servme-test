package com.servme.test.part2through6;

public class Staff extends Person {
    private double sallary;

    public Staff(String name, String address, String school, String clazz, double sallary) {
        super(name, address, school, clazz);
        this.sallary = sallary;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }
}