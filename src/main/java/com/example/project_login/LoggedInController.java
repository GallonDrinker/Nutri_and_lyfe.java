package com.example.project_login;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class LoggedInController implements Initializable {

    @FXML
    private Button button_logout;

    @FXML Label label_welcome;

    @FXML Label label_username;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        button_logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DButils.changeScene(event,"hello-view.fxml", "Log In!", null, null);

            }
        });


    }

    public void setUserInformation(String username, String username1){
        label_welcome.setText("Welcome " + username + "!");
        label_username.setText("Your Name is "+ username1);
    }
}
