package application;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FeldVerpachtenController {
	
	@FXML
	private Button ButtonDurchsuchen;
	@FXML
	private Button ButtonVerpachten;
	@FXML
	private Button ButtonAbbrechen;
	
	FileChooser fileChooser = new FileChooser();
	
	public FileChooser getFileChooser() {
	fileChooser.setTitle("Wähle die Bilder aus");
	// damit kommen wir direkt in den Benutzerordner auf dem Rechner des Nutzers
	fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));

	// damit legen wir fest, welche Datentypen wir zulassen
	fileChooser.getExtensionFilters().addAll(
			new FileChooser.ExtensionFilter("All Images", "*.*"),
		    new FileChooser.ExtensionFilter("BMP", "*.bmp"),
		    new FileChooser.ExtensionFilter("JPG", "*.jpg"),
		    new FileChooser.ExtensionFilter("PNG", "*.png"),
		    new FileChooser.ExtensionFilter("GIF", "*.gif"));
	
	return fileChooser;
	}
	
	@FXML
	public void clickButtonDurchsuchen (@SuppressWarnings("exports") ActionEvent event) throws IOException {
		
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		FileChooser fileChooser2=getFileChooser();
		fileChooser2.showOpenDialog(window);
		
	}
	@FXML
	public void clickButtonAbbrechen (@SuppressWarnings("exports") ActionEvent event) throws IOException {
			
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("VerpachteteFelder.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		secondWindowScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(secondWindowScene);
		window.show();
	}

	
}
