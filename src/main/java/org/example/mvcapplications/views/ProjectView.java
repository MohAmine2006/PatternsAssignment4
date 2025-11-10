package org.example.mvcapplications.views;


import org.example.mvcapplications.controllers.ProjectController;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import org.example.mvcapplications.models.Project;

public class ProjectView extends VBox {
    private final TableView<Project> tableView;
    private final ProjectController controller;

    public ProjectView(ProjectController controller) {
        this.controller = controller;
        this.tableView = new TableView<>();
        this.createTable();
        this.bindTableData();
        this.getChildren().addAll(tableView);
    }

    private void createTable() {
        TableColumn<Project, Integer> projectIdCol = new TableColumn<>("Project ID");
        projectIdCol.setCellValueFactory(new PropertyValueFactory<>("projectId"));

        TableColumn<Project, String> projectNameCol = new TableColumn<>("Project Name");
        projectNameCol.setCellValueFactory(new PropertyValueFactory<>("projectName"));

        TableColumn<Project, Double> budgetCol = new TableColumn<>("Budget");
        budgetCol.setCellValueFactory(new PropertyValueFactory<>("budget"));

        this.tableView.getColumns().addAll(projectIdCol, projectNameCol, budgetCol);
    }

    private void bindTableData() {
        tableView.setItems(controller.getProjects());
    }
}