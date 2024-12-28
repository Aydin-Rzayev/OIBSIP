package com.oibsip;

import com.oibsip.NumberGuesser;
import java.io.IOException;

import javafx.scene.Parent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SecondaryController {
    @FXML
    TextField guessedText;

    @FXML
    private void guessTheNumber() throws IOException {
        try{
            Integer guessed = Integer.parseInt(guessedText.getText());
            NumberGuesser.setNumber(guessed);
            NumberGuesser.randomNumber();

            FXMLLoader loader = new FXMLLoader(App.class.getResource("result.fxml"));
            Parent root = loader.load();

            FinalController controller = loader.getController();
            Integer secretNumber = NumberGuesser.getSecretNumber();
            Integer guessedNumber = NumberGuesser.getGuessedNumber();
            controller.displayGuessedNumber(guessedNumber);
            controller.displayRandomNumber(secretNumber);
            controller.displayResult(secretNumber, guessedNumber);
            App.setRoot(root);
        }catch(NumberFormatException e){
            guessedText.setText("Invalid number");
        }
    }

    @FXML
    private void goBack() throws IOException{
        App.setRoot("primary");
    }
}