package org.example.week132_mediator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ChatApplication extends Application {

    ChatMediator mediator = new ChatMediatorImpl();

    @Override
    public void start(Stage primaryStage) throws Exception {
        setupClient("John", 100);
        setupClient("Doe", 300);
        setupClient("Jane", 500);
    }

    private void setupClient(String username, int xOffset) {
        Stage stage = new Stage();
        VBox root = new VBox();
        TextArea textArea = new TextArea();
        TextField textField = new TextField();
        Button sendButton = new Button("Send");

        ChatUser user = new ChatUserImpl(mediator, username, textArea);
        mediator.addUser(user);

        sendButton.setOnAction(e -> {
            if (textField.getText().trim().length() > 0) {
                user.send(textField.getText());
                textField.clear();
            }
        });

        root.getChildren().addAll(textArea, textField, sendButton);
        Scene scene = new Scene(root, 400, 200);
        stage.setScene(scene);
        stage.setTitle(username);
        stage.setX(xOffset);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

