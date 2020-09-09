package com.servme.test.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StaffRepo {
    private List<Staff> staffs = new ArrayList<>();

    public void addStaff(Staff s){
        staffs.add(s);
    }

    public Staff searchByName(String name) {
        // TODO
        return staffs.stream().filter(s -> Objects.equals(name, s.getName())).findFirst().orElse(null);
    }
}
