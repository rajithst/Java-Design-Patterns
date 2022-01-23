package com.rst.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList(){

        List<Employee> employees = new ArrayList<>();
        Employee dbEmployee = new EmployeeDB("1234","Rajith","Thennakoon","rajith@gmail.com");
        employees.add(dbEmployee);

        EmployeeLdap employeeLdap = new EmployeeLdap("1235","Silva","Tiago","tiago@gmail.com");
        Employee adaptedEmployee = new EmployeeAdapterLdap(employeeLdap);
        employees.add(adaptedEmployee);
        return employees;
    }
}
