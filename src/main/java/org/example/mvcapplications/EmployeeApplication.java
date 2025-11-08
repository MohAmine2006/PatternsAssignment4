package org.example.mvcapplications;

import org.example.mvcapplications.controllers.EmployeeController;
import org.example.mvcapplications.views.EmployeeView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EmployeeApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        EmployeeController controller = new EmployeeController();
        EmployeeView view = new EmployeeView(controller);

        Scene scene = new Scene(view, 400, 300);
        stage.setTitle("Employee Table (MVC)");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
