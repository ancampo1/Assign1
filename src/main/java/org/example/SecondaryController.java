package org.example;

import java.io.IOException;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class SecondaryController {
    public SecondaryController()
    {

    }
    @FXML private ListView list;

    public void fill()
    {

        list.getItems().addAll("red","blue","orange");

    }

    @FXML
    private void switchToDelete() throws IOException {

        App.setRoot("Delete");
    }
    @FXML
    private void switchToAdd() throws IOException {

        App.setRoot("Add");
    }

}