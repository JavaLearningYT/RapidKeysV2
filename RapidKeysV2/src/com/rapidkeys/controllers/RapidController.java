package com.rapidkeys.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class RapidController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private BorderPane borderPane;

    @FXML
    void getHistory(ActionEvent event) {
    	Parent par;
		try {
			par = FXMLLoader.load(getClass().getResource("/com/rapidkeys/resources/fxml/mainStage/history/History.fxml"));
	    	borderPane.setCenter(par);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void getHome(ActionEvent event) {
    	Parent par;
		try {
			par = FXMLLoader.load(getClass().getResource("/com/rapidkeys/resources/fxml/mainStage/home/Home.fxml"));
	    	borderPane.setCenter(par);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @FXML
    void getSettings(ActionEvent event) {
    	Parent par;
		try {
			par = FXMLLoader.load(getClass().getResource("/com/rapidkeys/resources/fxml/mainStage/settings/Settings.fxml"));
	    	borderPane.setCenter(par);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void initialize() {
        assert borderPane != null : "fx:id=\"borderPane\" was not injected: check your FXML file 'RapidKeys.fxml'.";

    }
}
