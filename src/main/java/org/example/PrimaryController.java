package org.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController  {
    @FXML
    TextField userName,pass;

    @FXML
    private void switchToSecondary() throws IOException {
        while(!userName.getText().isEmpty() && !pass.getText().isEmpty())
        {
            App.setRoot("secondary");
        }


        App.setRoot("secondary");
    }
}
