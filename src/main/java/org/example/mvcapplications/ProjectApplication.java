package org.example.mvcapplications;

import org.example.mvcapplications.controllers.ProjectController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.mvcapplications.views.ProjectView;

import java.io.IOException;

public class ProjectApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ProjectController controller = new ProjectController();
        ProjectView view = new ProjectView(controller);

        Scene scene = new Scene(view, 400, 300);
        stage.setTitle("Project Table (MVC)");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
