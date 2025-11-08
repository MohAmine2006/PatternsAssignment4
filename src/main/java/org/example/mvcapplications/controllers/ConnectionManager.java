package org.example.mvcapplications.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/hr"; // or "jdbc:mysql://127.0.0.1:3306/hr"
        String user = "root";
        String password = "";

        return DriverManager.getConnection(url, user, password);
    }
}
