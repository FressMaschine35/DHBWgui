package application;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
		checkLogin();
	}

	@FXML
	private void checkLogin() throws IOException{
		Main m = new Main();
		if(userField.getText().toString().equals("Rietdorf") && userPassword.getText().toString().equals("123")) {
			warningLable.setText("Access");
			
			m.changeScene("Menue.fxml");
			
		}
		else if( userField.getText().isEmpty() && userPassword.getText().isEmpty()) {
			warningLable.setText("Access");
		}
		else {
			warningLable.setText("Benutzer oder Passwort Falsch");
		}
		
	}
	
	
	
	
}
