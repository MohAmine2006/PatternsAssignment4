package org.example.mvcapplications.views;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import org.example.mvcapplications.controllers.DepartmentController;
import org.example.mvcapplications.models.Department;

public class DepartmentView extends VBox {
    private final TableView<Department> tableView;
    private final DepartmentController controller;

    public DepartmentView(DepartmentController departmentController) {
        this.controller = departmentController;
        this.tableView = new TableView<>();
        createTable();
        bindTableData();
        this.getChildren().add(tableView);
    }

    private void createTable() {
        TableColumn<Department, Integer> depIdCol = new TableColumn<>("Department ID");
        depIdCol.setCellValueFactory(new PropertyValueFactory<>("departmentId"));

        TableColumn<Department, Integer> depNameCol = new TableColumn<>("Department Name");
        depNameCol.setCellValueFactory(new PropertyValueFactory<>("departmentName"));

        tableView.getColumns().addAll(depIdCol, depNameCol);
    }

    private void bindTableData() {
        tableView.setItems(controller.getDepartments());
    }
}
