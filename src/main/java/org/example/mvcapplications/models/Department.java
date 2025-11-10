package org.example.mvcapplications.models;

import javafx.beans.property.*;

public class Department {
    private final IntegerProperty departmentId;
    private final StringProperty departmentName;

    public Department(int departmentId, String departmentName) {
        this.departmentId = new SimpleIntegerProperty(departmentId);
        this.departmentName = new SimpleStringProperty(departmentName);
    }

    public IntegerProperty departmentIdProperty() {
        return departmentId;
    }

    public StringProperty departmentNameProperty() {
        return departmentName;
    }

}
