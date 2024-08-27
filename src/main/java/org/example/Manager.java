package org.example;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Staff {

    private String department;

    public Manager(String name, int id, String phoneNumber, String department) {
        super(name, id, phoneNumber);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



}


