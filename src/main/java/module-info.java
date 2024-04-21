module bjp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;
    requires json.simple;
    requires javafx.base; 
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    // Correct module name for Jackson annotations
    requires com.fasterxml.jackson.annotation;

    opens bjp.controller to javafx.fxml;
    exports bjp;
}
