package com.servme.test.part2through6;

public class Main {
    public static void main(String[] args) {
        PersonRepo personRepo = new PersonRepo();
        personRepo.addStudent(new Student("rebeca", null, null, null, 0));
        personRepo.addStudent(new Student("steve", null, null, null, 0));
        personRepo.addStaff(new Staff("chris", null, null, null, 0));
        personRepo.addStaff(new Staff("evan", null, null, null, 0));
        personRepo.addPerson(new Staff("evan", null, null, null, 0));
        personRepo.addPerson(new Student("steve", null, null, null, 0));

        System.out.println(personRepo.searchByStudnetName("rebeca"));
        System.out.println(personRepo.searchByStaffName("evan"));
        System.out.println(personRepo.searchByName("steve"));
        System.out.println(personRepo.searchByName("evan"));
        System.out.println(personRepo.searchByName("evan", Student.class));
        System.out.println(personRepo.searchByName("evan", Staff.class));

    }
}
