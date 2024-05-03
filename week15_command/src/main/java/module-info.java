module org.example.week15_command {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.week15_command to javafx.fxml;
    exports org.example.week15_command;
}