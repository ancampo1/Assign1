package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

public class AddPerson {
    Person person;
    @FXML
    TextField firstName,lastName,ageText,idText,dobText;
    @FXML public void Add(ActionEvent event) throws IOException {
        String newF,newL;
        int newAge,newId;
        LocalDate newDOB;
        while(!firstName.getText().isEmpty() && !lastName.getText().isEmpty() && !ageText.getText().isEmpty() && !idText.getText().isEmpty() && !dobText.getText().isEmpty())
        {
            newF = firstName.getText();
            newL= lastName.getText();
            newAge = Integer.parseInt(ageText.getText());
            newId = Integer.parseInt(idText.getText());
            newDOB = LocalDate.parse(dobText.getText());
            person = new Person(newF,newL,newAge,newId,newDOB);

        }
        switchToPrimary();

    }
    @FXML
    private void switchToPrimary() throws IOException
    {

        App.setRoot("primary");
    }


}
