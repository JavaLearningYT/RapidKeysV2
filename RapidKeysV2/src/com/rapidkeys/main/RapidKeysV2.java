package com.rapidkeys.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RapidKeysV2 extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage mainStage) {
		Stage a = new Stage();
		try {
			Parent p = FXMLLoader.load(getClass().getResource("/com/rapidkeys/resources/fxml/mainStage/RapidKeys.fxml"));
			Scene scene = new Scene(p);
			a.setScene(scene);
			a.showAndWait();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
