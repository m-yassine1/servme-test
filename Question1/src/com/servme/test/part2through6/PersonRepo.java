package com.servme.test.part2through6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonRepo {
    private List<Person> persons = new ArrayList<>();
    private List<Staff> staffs = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public void addStaff(Staff s) {
        staffs.add(s);
    }

    public Staff searchByStaffName(String name) {
        // TODO
        return staffs.stream().filter(s -> Objects.equals(name, s.getName())).findFirst().orElse(null);
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public Student searchByStudnetName(String name) {
        // TODO
        return students.stream().filter(s ->Objects.equals(name, s.getName())).findFirst().orElse(null);
    }

    public void addPerson(Person p){
        persons.add(p);
    }

    public Person searchByName(String name) {
        // TODO
        return persons.stream().filter(p -> Objects.equals(name, p.getName())).findFirst().orElse(null);
    }

    public Person searchByName(String name, Class<? extends Person> kind) {
        // TODO
        if(kind == Student.class) {
            return persons.stream().filter(p -> p instanceof Student && Objects.equals(name, p.getName())).findFirst().orElse(null);
        } else if(kind == Staff.class) {
            return persons.stream().filter(p -> p instanceof Staff && Objects.equals(name, p.getName())).findFirst().orElse(null);
        }

        throw new RuntimeException("Class of kind " + kind + " is not found in the list");
    }
}
