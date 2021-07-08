package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class StammdatenController {
	
	@FXML
	private Button ButtonAbbrechen;
	@FXML
	private Button ButtonSpeichern;
	@FXML
	private Label warningLable;
	@FXML
	private Button ButtonSpeichern1;
	@FXML
	private Label warningLable1;
	
	
	@FXML
	public void clickButtonAbbrechen (@SuppressWarnings("exports") ActionEvent event) throws IOException {
		
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("Menue.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		secondWindowScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(secondWindowScene);
		window.show();
		
	}
	@FXML
	public void clickTextMenu (@SuppressWarnings("exports") MouseEvent event) throws IOException {
		
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("Menue.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		secondWindowScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(secondWindowScene);
		window.show();
	}
	@FXML
	public void clickTextMeineFelder (@SuppressWarnings("exports") MouseEvent event) throws IOException {
		
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("MeineFelder.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		secondWindowScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(secondWindowScene);
		window.show();
	}
	
	@FXML
	public void clickTextVerpachten (@SuppressWarnings("exports") MouseEvent event) throws IOException {
		
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("VerpachteteFelder.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		secondWindowScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(secondWindowScene);
		window.show();
	}
	@FXML
	public void clickTextSuche (@SuppressWarnings("exports") MouseEvent event) throws IOException {
		
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("Suche.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		secondWindowScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(secondWindowScene);
		window.show();
	}
	@FXML
	public void clickHyperlinkAbmelden (@SuppressWarnings("exports") ActionEvent event) throws IOException {
		
		Image titleImg = new Image(getClass().getResourceAsStream("intelligente-landwirtschaft.png"));
		
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("Logout.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		secondWindowScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		Stage window2=new Stage();
		window2.getIcons().add(titleImg);
		window2.setTitle("Urbane Gärten");
		window2.setScene(secondWindowScene);
		window2.show();
		window.close();
	}
	@FXML
	public void clickButtonSpeichern (@SuppressWarnings("exports") ActionEvent event) throws IOException {
		warningLable.setText("Daten erfolgreich gespeichert");
		
	}
	@FXML
	public void clickButtonSpeichern1 (@SuppressWarnings("exports") ActionEvent event) throws IOException {
		warningLable1.setText("Daten erfolgreich gespeichert");
		
	}
}
