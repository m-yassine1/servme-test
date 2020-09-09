package com.servme.test.part2through6;

public class Person {
    private String name;
    private String address;
    private String school;
    private String clazz;

    public Person(String name, String address, String school, String clazz) {
        this.name = name;
        this.address = address;
        this.school = school;
        this.clazz = clazz;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
