package com.servme.test.part2through6;

/**
 * To answer part 2, the following redundancy is bad because we can find common features between the classes, and through
 * these features, we add can add those properties add obtain a single class, and use inheritance accordingly to extend those
 * properties to these callses. In our case, that common class is called Person .
 */
public class Student extends Person {
    private double fee;

    public Student(String name, String address, String school, String clazz, double fee) {
        super(name, address, school, clazz);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
