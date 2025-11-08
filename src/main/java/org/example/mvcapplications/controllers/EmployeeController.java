package org.example.mvcapplications.controllers;

import org.example.mvcapplications.models.DatabaseAccess;
import org.example.mvcapplications.models.Employee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EmployeeController {

    public EmployeeController() {

    }

    public ObservableList<Employee> getEmployees() {
        return DatabaseAccess.getAllEmployees();
    }

    public ObservableList<Employee> getEmployeesByFirstName(String firstName) {
        return DatabaseAccess.getEmployeesByFirstName(firstName);
    }

}
