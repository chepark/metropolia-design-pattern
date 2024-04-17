module org.example.week132_mediator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.week132_mediator to javafx.fxml;
    exports org.example.week132_mediator;
}