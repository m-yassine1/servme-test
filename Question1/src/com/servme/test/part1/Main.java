package com.servme.test.part1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StaffRepo staffRepo = new StaffRepo();
        StudentRepo studentRepo = new StudentRepo();
        studentRepo.addStudent(new Student("rebeca", null, null, null, 0));
        studentRepo.addStudent(new Student("steve", null, null, null, 0));
        staffRepo.addStaff(new Staff("rebeca", null, null, null, 0));
        staffRepo.addStaff(new Staff("steve", null, null, null, 0));
        System.out.println(staffRepo.searchByName("rebeca"));
        System.out.println(staffRepo.searchByName("rebecaa"));
    }
}
