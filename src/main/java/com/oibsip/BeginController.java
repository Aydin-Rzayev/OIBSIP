package com.oibsip;

import java.io.IOException;
import javafx.fxml.FXML;

public class BeginController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
