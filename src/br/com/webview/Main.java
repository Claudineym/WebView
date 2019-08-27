package br.com.webview;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private BorderPane root;

	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("/br/com/webview/WebView.fxml"));
        try {
			root = (BorderPane) loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
        Scene scene = new Scene(root);        
        primaryStage.setTitle("WebView 1.0");
        primaryStage.setScene(scene);
        
        primaryStage.show();
	}

	public static void main(String[] args) {	
		launch(args);
	}
}
