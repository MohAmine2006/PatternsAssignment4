//module org.example.mvcapplications {
//    requires javafx.controls;
//    requires javafx.fxml;
//    requires java.sql;
//
//
//    opens org.example.mvcapplications.views to javafx.fxml;
//    exports org.example.mvcapplications.models;
//    exports org.example.mvcapplications.views;
//    opens org.example.mvcapplications.models to javafx.base;
//}

module org.example.mvcapplications {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.base;
    requires javafx.graphics;

    // Export packages you want to be visible to other modules
    exports org.example.mvcapplications.models;
    exports org.example.mvcapplications.views;

    // Open packages to JavaFX for reflection (FXML & Application)
    opens org.example.mvcapplications to javafx.graphics, javafx.fxml; // main app class
    opens org.example.mvcapplications.views to javafx.fxml;
    opens org.example.mvcapplications.models to javafx.base;
}