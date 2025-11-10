package org.example.mvcapplications.controllers;

import org.example.mvcapplications.models.Employee;
import javafx.collections.ObservableList;

public class EmployeeController {

    public EmployeeController() {

    }

    public ObservableList<Employee> getEmployees() {
        return Employee.getAllEmployees();
    }

    public ObservableList<Employee> getEmployeesByFirstName(String firstName) {
        return Employee.getEmployeesByFirstName(firstName);
    }

}
