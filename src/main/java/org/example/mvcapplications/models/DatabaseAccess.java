//package org.example.mvcapplications.models;
//
//import org.example.mvcapplications.controllers.ConnectionManager;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class DatabaseAccess {
//
//    public static ObservableList<Employee> getAllEmployees() {
//        ObservableList<Employee> employees = FXCollections.observableArrayList();
//        String sql = "SELECT * FROM employees";
//
//        try (Connection connection = ConnectionManager.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(sql);
//             ResultSet resultSet = preparedStatement.executeQuery(sql)) {
//
//            while (resultSet.next()) {
//                employees.add(new Employee(
//                        resultSet.getInt("employeeID"),
//                        resultSet.getString("firstName"),
//                        resultSet.getString("lastName"),
//                        resultSet.getDouble("salary"),
//                        resultSet.getInt("departmentID")
//                ));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return employees;
//    }
//
//    public static ObservableList<Employee> getEmployeesByFirstName(String firstName) {
//        ObservableList<Employee> employees = FXCollections.observableArrayList();
//        String sql = "SELECT * FROM employees WHERE firstName = ?";
//
//        try (Connection connection = ConnectionManager.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//
//            preparedStatement.setString(1, firstName);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//                employees.add(new Employee(
//                        resultSet.getInt("employeeID"),
//                        resultSet.getString("firstName"),
//                        resultSet.getString("lastName"),
//                        resultSet.getDouble("salary"),
//                        resultSet.getInt("departmentID")
//                ));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return employees;
//    }
//
//    public static ObservableList<Department> getAllDepartments() {
//        ObservableList<Department> departments = FXCollections.observableArrayList();
//        String sql = "SELECT * FROM departments";
//
//        try (Connection connection = ConnectionManager.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(sql);
//             ResultSet resultSet = preparedStatement.executeQuery(sql)) {
//
//            while (resultSet.next()) {
//                departments.add(new Department(
//                        resultSet.getInt("departmentID"),
//                        resultSet.getString("departmentName")
//                ));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return departments;
//    }
//
//}