package org.example.mvcapplications.views;

import org.example.mvcapplications.controllers.EmployeeController;
import org.example.mvcapplications.models.Employee;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class EmployeeView extends VBox {
    TextField firstNameText;
    private final TableView<Employee> tableView;
    private final EmployeeController controller;

    public EmployeeView(EmployeeController controller) {
        this.controller = controller;
        this.tableView = new TableView<>();
        this.createSearchInterface();
        this.createTable();
        this.bindTableData();
        this.getChildren().addAll(createSearchInterface(), tableView);
    }

    private HBox createSearchInterface() {
        HBox hBox = new HBox(5);
        Label firstNameLabel = new Label("First Name:");
        firstNameText = new TextField();
        Button searchNameButton = new Button("Search");

        searchNameButton.setOnAction(event -> {
            String firstName = firstNameText.getText().trim().toLowerCase(); // Removes extra spaces before and after; converts to lowercase
            tableView.setItems(controller.getEmployeesByFirstName(firstName));
        });

        hBox.getChildren().addAll(firstNameLabel, firstNameText, searchNameButton);
        return hBox;
    }

    private void createTable() {
        TableColumn<Employee, Integer> empIdNameCol = new TableColumn<>("Employee ID");
        empIdNameCol.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Employee, String> firstNameCol = new TableColumn<>("First Name");
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn<Employee, String> lastNameCol = new TableColumn<>("Last Name");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn<Employee, Double> salaryCol = new TableColumn<>("Salary");
        salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));

        TableColumn<Employee, Integer> depIdNameCol = new TableColumn<>("Department ID");
        depIdNameCol.setCellValueFactory(new PropertyValueFactory<>("departmentId"));

        tableView.getColumns().addAll(empIdNameCol, firstNameCol, lastNameCol, salaryCol, depIdNameCol);
    }

    private void bindTableData() {
        tableView.setItems(controller.getEmployees());
    }
}