module com.oibsip {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens com.oibsip to javafx.fxml;
    exports com.oibsip;
}
