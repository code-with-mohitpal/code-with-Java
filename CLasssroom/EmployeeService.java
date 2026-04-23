package com.employee;

import java.util.ArrayList;

public class EmployeeService {

    ArrayList<Employee> list = new ArrayList<>();

    public void addEmployee(Employee e) {
        list.add(e);
        System.out.println("Employee Added!");
    }

    public void viewEmployees() {
        if (list.isEmpty()) {
            System.out.println("No Employees Found!");
        } else {
            for (Employee e : list) {
                e.display();
            }
        }
    }
}
