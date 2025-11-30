module com.profeco.profecoapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.profeco.profecoapp to javafx.fxml;
    exports com.profeco.profecoapp;
}
