package org.example.mvcapplications.controllers;

import javafx.collections.ObservableList;
import org.example.mvcapplications.models.Project;

public class ProjectController {

    public ProjectController() {

    }

    public ObservableList<Project> getProjects() {
        return Project.getAllProjects();
    }

}
