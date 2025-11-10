package org.example.mvcapplications.models;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.mvcapplications.controllers.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

    public static ObservableList<Department> getAllDepartments() {
        ObservableList<Department> departments = FXCollections.observableArrayList();
        String sql = "SELECT * FROM departments";

        try (Connection connection = ConnectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery(sql)) {

            while (resultSet.next()) {
                departments.add(new Department(
                        resultSet.getInt("departmentID"),
                        resultSet.getString("departmentName")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departments;
    }
}
