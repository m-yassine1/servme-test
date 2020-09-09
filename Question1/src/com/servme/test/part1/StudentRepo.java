package com.servme.test.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentRepo {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s){
        students.add(s);
    }

    public Student searchByName(String name) {
        // TODO
        return students.stream().filter(s -> Objects.equals(name, s.getName())).findFirst().orElse(null);
    }
}
