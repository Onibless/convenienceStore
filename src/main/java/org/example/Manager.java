package org.example;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Staff {
    private List<Cashiers> cashiers;
    private String department;

    public Manager(String name, int id, String phoneNumber, String department)  {
        super(name, id, phoneNumber);
        this.department = department;
        this.cashiers = new ArrayList<>();
    }
   public String getDepartment() {return  department;}
    public void setDepartment(String department){this.department= department;}

    public  List<Cashiers> getCashiers() {return cashiers;}

    public void hireCashier(Cashiers cashiers) {
        cashiers.add(cashiers);
    }

    public void fireCashier(Cashiers cashiers){
        cashiers.remove(cashiers);
        }

}


