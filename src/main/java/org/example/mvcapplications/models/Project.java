package org.example.mvcapplications.models;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.mvcapplications.controllers.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

    public static ObservableList<Project> getAllProjects() {
        ObservableList<Project> projects = FXCollections.observableArrayList();
        String sql = "SELECT * FROM projects";

        try (Connection connection = ConnectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery(sql)) {

            while (resultSet.next()) {
                projects.add(new Project(
                        resultSet.getInt("projectID"),
                        resultSet.getString("projectName"),
                        resultSet.getDouble("budget")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return projects;
    }
}