package com.oibsip;
import com.oibsip.NumberGuesser;
import java.io.IOException;
import java.io.*;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class FinalController {
    @FXML
    private Label your;
    @FXML
    private Label random;
    @FXML
    private Label result;

    
    public void displayGuessedNumber(Integer num){
        your.setText("Your guess " + num);
        
    }

    
    public void displayRandomNumber(Integer num){
        random.setText("Random number " + num);
    }

    @FXML
    private void playAgain() throws IOException{
        App.setRoot("secondary");
    }

    @FXML
    private void finish() throws IOException{
        App.setRoot("primary");
    }

    public void displayResult(Integer randomNum, Integer guessedNum) throws IOException{
        if(randomNum == guessedNum){
            result.setText("You Win!");
        }
        else{
            result.setText("Sorry! Try Again...");
        }
    }
    
}
