package org.example.mvcapplications;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.mvcapplications.controllers.DepartmentController;
import org.example.mvcapplications.views.DepartmentView;

import java.io.IOException;

public class DepartmentApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        DepartmentController controller = new DepartmentController();
        DepartmentView view = new DepartmentView(controller);

        Scene scene = new Scene(view, 400, 300);
        stage.setTitle("Department Table (MVC)");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
