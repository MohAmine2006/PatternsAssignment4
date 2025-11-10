package org.example.mvcapplications.models;

import javafx.beans.property.*;

public class Project {
    private final IntegerProperty projectId;
    private final StringProperty projectName;
    private final DoubleProperty budget;

    public Project(int projectId, String projectName, double budget) {
        this.projectId = new SimpleIntegerProperty(projectId);
        this.projectName = new SimpleStringProperty(projectName);
        this.budget = new SimpleDoubleProperty(budget);
    }

    public IntegerProperty projectIdProperty() {
        return projectId;
    }

    public StringProperty projectNameProperty() {
        return projectName;
    }

    public DoubleProperty budgetProperty() {
        return budget;
    }
}