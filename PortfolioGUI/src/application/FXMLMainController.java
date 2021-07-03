package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLMainController implements Initializable {

	@FXML private Label rLabel;
	
	@FXML private Label lLabel;
	
	@FXML private TableView<Fields> rentedFields;
	@FXML private TableView<Fields> leasedFields;
	
	@FXML private TableColumn<Fields, String> rFieldName;
	@FXML private TableColumn<Fields, String> rStartDate;
	@FXML private TableColumn<Fields, String> rEndDate;
	@FXML private TableColumn<Fields, String> rDetails;
	
	@FXML private TableColumn<Fields, String> lFieldName;
	@FXML private TableColumn<Fields, String> lStartDate;
	@FXML private TableColumn<Fields, String> lEndDate;
	@FXML private TableColumn<Fields, String> lDetails;
	
	// test data
	// long list to test scroll bar
	ObservableList<Fields> dataB = FXCollections.observableArrayList(
			new Fields("Field 1", "2021-01-21", "2021-02-21", "Details"),
			new Fields("Field 2", "2021-02-22", "2021-03-22", "Details"),
			new Fields("Field 3", "2021-03-23", "2021-04-23", "Details"),
			new Fields("Field 4", "2021-04-24", "2021-05-24", "Details"),
			new Fields("Field 5", "2021-05-25", "2021-06-25", "Details"),
			new Fields("Field 1", "2021-01-21", "2021-02-21", "Details"),
			new Fields("Field 2", "2021-02-22", "2021-03-22", "Details"),
			new Fields("Field 3", "2021-03-23", "2021-04-23", "Details"),
			new Fields("Field 4", "2021-04-24", "2021-05-24", "Details"),
			new Fields("Field 5", "2021-05-25", "2021-06-25", "Details"),
			new Fields("Field 1", "2021-01-21", "2021-02-21", "Details"),
			new Fields("Field 2", "2021-02-22", "2021-03-22", "Details"),
			new Fields("Field 3", "2021-03-23", "2021-04-23", "Details"),
			new Fields("Field 4", "2021-04-24", "2021-05-24", "Details"),
			new Fields("Field 5", "2021-05-25", "2021-06-25", "Details"),
			new Fields("Field 1", "2021-01-21", "2021-02-21", "Details"),
			new Fields("Field 2", "2021-02-22", "2021-03-22", "Details"),
			new Fields("Field 3", "2021-03-23", "2021-04-23", "Details"),
			new Fields("Field 4", "2021-04-24", "2021-05-24", "Details"),
			new Fields("Field 5", "2021-05-25", "2021-06-25", "Details"),
			new Fields("Field 1", "2021-01-21", "2021-02-21", "Details"),
			new Fields("Field 2", "2021-02-22", "2021-03-22", "Details"),
			new Fields("Field 3", "2021-03-23", "2021-04-23", "Details"),
			new Fields("Field 4", "2021-04-24", "2021-05-24", "Details"),
			new Fields("Field 5", "2021-05-25", "2021-06-25", "Details"),
			new Fields("Field 1", "2021-01-21", "2021-02-21", "Details"),
			new Fields("Field 2", "2021-02-22", "2021-03-22", "Details"),
			new Fields("Field 3", "2021-03-23", "2021-04-23", "Details"),
			new Fields("Field 4", "2021-04-24", "2021-05-24", "Details"),
			new Fields("Field 5", "2021-05-25", "2021-06-25", "Details")
	);
	
	ObservableList<Fields> dataC = FXCollections.observableArrayList(
			new Fields("Field 1", "2020-06-13", "2020-07-13", "Details"),
			new Fields("Field 2", "2020-07-14", "2020-08-14", "Details"),
			new Fields("Field 3", "2020-08-15", "2020-09-15", "Details"),
			new Fields("Field 4", "2020-09-16", "2020-10-16", "Details"),
			new Fields("Field 5", "2020-10-17", "2020-11-17", "Details")
	);
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {			
		
		// associate data with columns
		rFieldName.setCellValueFactory(new PropertyValueFactory<Fields, String>("fieldName"));
		rStartDate.setCellValueFactory(new PropertyValueFactory<Fields, String>("startDate"));
		rEndDate.setCellValueFactory(new PropertyValueFactory<Fields, String>("endDate"));
		rDetails.setCellValueFactory(new PropertyValueFactory<Fields, String>("details"));
		
		lFieldName.setCellValueFactory(new PropertyValueFactory<Fields, String>("fieldName"));
		lStartDate.setCellValueFactory(new PropertyValueFactory<Fields, String>("startDate"));
		lEndDate.setCellValueFactory(new PropertyValueFactory<Fields, String>("endDate"));
		lDetails.setCellValueFactory(new PropertyValueFactory<Fields, String>("details"));
		
		// add data inside table
		rentedFields.setItems(dataB);
		leasedFields.setItems(dataC);
		
	}
	
}
