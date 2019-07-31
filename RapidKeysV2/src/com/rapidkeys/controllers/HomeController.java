package com.rapidkeys.controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;

public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label fileName;

    @FXML
    private Label lineCount;

    @FXML
    private Label wordCount;

    @FXML
    private Label typingTime;

    @FXML
    private TableView<?> tableView;

    @FXML
    private TableColumn<?, ?> fileColumn;

    @FXML
    void openFile(ActionEvent event) {
    	FileChooser picker = new FileChooser();
    	File file = picker.showOpenDialog(fileName.getScene().getWindow());
    	if(file==null) {
    		return;
    	}
    	fileName.setText(file.getName());
    	try {
    		List<String> hold = Files.readAllLines(file.toPath());
			int count = hold.size();
			lineCount.setText(count+"");
			int words =0;
			for(String e:hold) {
				words+=e.split(" ").length;
			}
			wordCount.setText(words+"");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }

    @FXML
    void initialize() {
        assert fileName != null : "fx:id=\"fileName\" was not injected: check your FXML file 'Home.fxml'.";
        assert lineCount != null : "fx:id=\"lineCount\" was not injected: check your FXML file 'Home.fxml'.";
        assert wordCount != null : "fx:id=\"wordCount\" was not injected: check your FXML file 'Home.fxml'.";
        assert typingTime != null : "fx:id=\"typingTime\" was not injected: check your FXML file 'Home.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'Home.fxml'.";
        assert fileColumn != null : "fx:id=\"fileColumn\" was not injected: check your FXML file 'Home.fxml'.";

    }
}
