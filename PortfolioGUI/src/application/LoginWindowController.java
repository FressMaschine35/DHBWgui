package application;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LoginWindowController {
	
	
	public LoginWindowController() {
		
	}
	
	@FXML
	private Button lbutton;
	@FXML
	private TextField userField;
	@FXML
	private PasswordField userPassword;
	@FXML
	private Label warningLable;
	@FXML
	private Label loginField;
	@FXML
	private Hyperlink passwortVergessenLink;
	
	@FXML
	public void loginUser (@SuppressWarnings("exports") ActionEvent event) throws IOException{
		checkLogin(event);
	}

	@FXML
	private void checkLogin(ActionEvent event) throws IOException{
		
		Image titleImg = new Image(getClass().getResourceAsStream("intelligente-landwirtschaft.png"));
		
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("Menue.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		secondWindowScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		
		Stage window2=new Stage();
		window2.getIcons().add(titleImg);
		window2.setTitle("Urbane G?rten");
		
		
		
		
		if((userField.getText().toString().equals("Rietdorf") && userPassword.getText().toString().equals("123"))||( userField.getText().isEmpty() && userPassword.getText().isEmpty())) {
			warningLable.setText("Access");
			
			window2.setScene(secondWindowScene);
			window2.show();
			window.close();
		}
				
		else {
			warningLable.setText("Benutzer oder Passwort Falsch");
			userField.clear();
			userPassword.clear();
		}
	
		
	}
	
	@FXML
	private void clickPasswortVergessenLink(ActionEvent event) throws IOException{
		Image titleImg = new Image(getClass().getResourceAsStream("intelligente-landwirtschaft.png"));
		
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("PasswortVergessen.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		secondWindowScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(secondWindowScene);
		window.getIcons().add(titleImg);
		window.setTitle("Urbane G?rten");
		window.show();
	}
}

