package com.training.collection;

import java.util.ArrayList;
import java.util.List;
public class Loe {
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(112,"suresh",12345));
        emp.add(new Employee(113,"Rajesh",12346));
        emp.add(new Employee(114,"sunil",123457));
        emp.add(new Employee(115,"Naveen",123458));
        for (Employee e : emp) {
            if(e.getEmpName().startsWith("S"))
                System.out.println(e);
        }
    }
}