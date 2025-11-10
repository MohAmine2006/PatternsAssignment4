package org.example.mvcapplications.controllers;

import javafx.collections.ObservableList;
import org.example.mvcapplications.models.Department;

public class DepartmentController {

    public DepartmentController() {

    }

    public ObservableList<Department> getDepartments() {
        return Department.getAllDepartments();
    }

}
