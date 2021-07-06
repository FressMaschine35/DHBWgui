package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MeineFelderController {
	@FXML
	private Text TextMenu;
	@FXML
	private Text TextVerpachten;
	@FXML
	private Text TextStammdaten;
	@FXML
	private Text TextSuche;
	@FXML
	private Hyperlink HyperlinkAbmelden;
	
	
	
	
	@FXML
	public void clickTextMenu (@SuppressWarnings("exports") MouseEvent event) throws IOException {
		
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("Menue.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(secondWindowScene);
		window.show();
	}
//	@FXML
//	public void clickTextVerpachten (@SuppressWarnings("exports") MouseEvent event) throws IOException {
//		
//		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("Menue.fxml"));
//		Scene secondWindowScene=new Scene(secondWindowParent);
//		
//		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
//		window.setScene(secondWindowScene);
//		window.show();
//	}
	@FXML
	public void clickTextStammdaten (@SuppressWarnings("exports") MouseEvent event) throws IOException {
		
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("Stammdaten.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(secondWindowScene);
		window.show();
	}
	@FXML
	public void clickTextSuche (@SuppressWarnings("exports") MouseEvent event) throws IOException {
		
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("Suche.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(secondWindowScene);
		window.show();
	}
	@FXML
	public void clickHyperlinkAbmelden (@SuppressWarnings("exports") ActionEvent event) throws IOException {
		
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene secondWindowScene=new Scene(secondWindowParent);
		
		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
		Stage window2=new Stage();
		window2.setScene(secondWindowScene);
		window2.show();
		window.close();
	}
}
