package application;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
	public void loginUser (@SuppressWarnings("exports") ActionEvent event) throws IOException{
		checkLogin(event);
	}

	@FXML
	private void checkLogin(ActionEvent event) throws IOException{
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("Menue.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		Stage window2=new Stage();
		
		
		
		
		
		
		
		if((userField.getText().toString().equals("Rietdorf") && userPassword.getText().toString().equals("123"))||( userField.getText().isEmpty() && userPassword.getText().isEmpty())) {
			warningLable.setText("Access");
			window2.setScene(secondWindowScene);
			window2.show();
			//window.close();
		}
				
		else {
			warningLable.setText("Benutzer oder Passwort Falsch");
			userField.clear();
			userPassword.clear();
		}
	
	
	
}
}

