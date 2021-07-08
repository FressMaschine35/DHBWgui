package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MenuController {

	@FXML
	private Group buttonGarten;
	@FXML
	private Group buttonVerpachtung;
	@FXML
	private Group buttonStammdaten;
	@FXML
	private Group buttonSuche;
	@FXML
	private Label labelWelcome;
	
	
		
	@FXML
	public void clickButtonGarten (@SuppressWarnings("exports") MouseEvent event) throws IOException {
		
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("MeineFelder.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		secondWindowScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(secondWindowScene);
		window.show();
		
	}
	
	@FXML
	public void clickButtonVerpachtung (@SuppressWarnings("exports") MouseEvent event) throws IOException {
		
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("VerpachteteFelder.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		secondWindowScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(secondWindowScene);
		window.show();
		
	}
	
	@FXML
	public void clickButtonStammdaten (@SuppressWarnings("exports") MouseEvent event) throws IOException {
		
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("Stammdaten.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		secondWindowScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(secondWindowScene);
		window.show();
		
	}
	
	@FXML
	public void clickButtonSuche (@SuppressWarnings("exports") MouseEvent event) throws IOException {
		
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
	
	
	
}
