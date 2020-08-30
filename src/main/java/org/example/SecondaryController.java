package org.example;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class SecondaryController implements Initializable {
    public SecondaryController()
    {

    }
    @FXML private ListView list;


    @FXML
    private void switchToDelete() throws IOException {

        App.setRoot("Delete");
    }
    @FXML
    private void switchToAdd() throws IOException {

        App.setRoot("Add");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        Person one = new Person("Bob","Myers",23,25, LocalDate.of(2020,1,8));

        ObservableList<Person> data = FXCollections.observableArrayList(one);
        list.setItems(data);
    }
}