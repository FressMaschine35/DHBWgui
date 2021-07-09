package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FeldDetailController implements Initializable{

		@FXML
		private Label LabelFeldbezeichnung;
		@FXML
		private Text TextVorNachname;
		@FXML
		private Text TextFlaeche;
		@FXML
		private Text TextStrNr;
		@FXML
		private Text TextPLZStadt;
		@FXML
		private DatePicker DateStartDatum;
		@FXML
		private DatePicker DateEndDatum;
		
		
		
		
		
		public FeldDetailController() {
			
		}
		public void initialize(){
			
		}
		public void initData(Fields feldbezeichnung) {
			LabelFeldbezeichnung.setText(feldbezeichnung.getFieldName());
			TextFlaeche.setText(Double. toString(feldbezeichnung.getFlaeche())+" m²");
			TextVorNachname.setText(feldbezeichnung.getOwnerName());
			TextStrNr.setText(feldbezeichnung.getStreetAndNr());
			TextPLZStadt.setText(feldbezeichnung.getPlzAndCity());
			DateStartDatum.setPromptText(feldbezeichnung.getStartDate());
			DateEndDatum.setPromptText(feldbezeichnung.getEndDate());
		}
		
		@FXML
		public void clickButtonAbbrechen(@SuppressWarnings("exports") ActionEvent event) throws IOException {
			
			Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
			window.close();
		}
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
		
		
}
