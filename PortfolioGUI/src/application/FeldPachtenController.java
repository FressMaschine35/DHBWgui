package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class FeldPachtenController {
	
	@FXML
	private Group GroupField1;
	
	@FXML
	private Group GroupField11;
	
	@FXML
	private Group GroupField12;
	
	
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
	public void clickTextStammdaten (@SuppressWarnings("exports") MouseEvent event) throws IOException {
		
		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("Stammdaten.fxml"));
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
	public void clickFeldMieten (@SuppressWarnings("exports") MouseEvent event) throws IOException {
//		Parent secondWindowParent=FXMLLoader.load(getClass().getResource("FeldMieten.fxml"));
//		Scene secondWindowScene=new Scene(secondWindowParent);
//		secondWindowScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//		Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
//		window.setScene(secondWindowScene);
//		window.show();
		Fields Feld1=new Fields("Grün über den Dächern Münchens", "20-02-2022", "20-02-2032","Heinz Müller", "Berliner Str. 2", "80805 München", 120.00);
		showFeldMieten(Feld1, event);
	}
	
	@FXML
	public void clickFeldMieten2 (@SuppressWarnings("exports") MouseEvent event) throws IOException {
		Fields Feld2=new Fields("Schöner Dachgarten in Hamburg", "20-08-2021", "20-02-2031","Holla Waldfee", "Berliner Str. 2", "80805 München", 240.00);
		showFeldMieten(Feld2, event);
	}
	
	@FXML
	public void clickFeldMieten3 (@SuppressWarnings("exports") MouseEvent event) throws IOException {
		Fields Feld3=new Fields("Garten ist Garten", "20-02-2022", "20-02-2032","Hans Wurst", "Berliner Str. 2", "80805 München", 155.00);
		showFeldMieten(Feld3, event);
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
	
	public Stage showFeldMieten(Fields feldbezeichnung, MouseEvent event) throws IOException {
		  FXMLLoader loader = new FXMLLoader(getClass().getResource("FeldMieten.fxml"));

		  Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  stage.setScene(new Scene(loader.load()));

		  FeldMietenController controller = loader.getController();
		  controller.initData(feldbezeichnung);

		  stage.show();

		  return stage;
		}
}
