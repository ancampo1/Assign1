package org.example;

import javafx.fxml.FXML;

import java.io.IOException;

public class DeletePerson {
    @FXML
    private void switchToPrimary() throws IOException
    {

        App.setRoot("primary");
    }
}