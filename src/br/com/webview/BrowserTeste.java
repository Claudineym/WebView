/**
 * 
 */
package br.com.webview;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * @author claudiney.viana
 *
 */
public class BrowserTeste implements Initializable{
	
	@FXML //  fx:id="borderPane"
    private BorderPane borderPane; // Value injected by FXMLLoader

	@FXML
	private WebView webview1;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		WebEngine webEngine = webview1.getEngine();
		webEngine.load("http://www.google.com.br");		
	}
}
