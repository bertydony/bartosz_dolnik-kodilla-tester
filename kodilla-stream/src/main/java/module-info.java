module com.example.kodillastream {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kodillastream to javafx.fxml;
    exports com.example.kodillastream;
}