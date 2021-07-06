package application;

import javafx.beans.property.SimpleStringProperty;

public class Fields {
	SimpleStringProperty fieldName;
	SimpleStringProperty startDate;
	SimpleStringProperty endDate;
	SimpleStringProperty details;
	
	Fields(String fName, String sDate, String eDate, String det) {
		this.fieldName = new SimpleStringProperty(fName);
		this.startDate = new SimpleStringProperty(sDate);
		this.endDate = new SimpleStringProperty(eDate);
		this.details = new SimpleStringProperty(det);
	}

	public String getFieldName() {
		return fieldName.get();
	}
	
	public void setFieldName(String fName) {
		fieldName.set(fName);
	}
	
	public String getStartDate() {
		return startDate.get();
	}
	
	public void setStartDate(String sDate) {
		startDate.set(sDate);
	}
	
	public String getEndDate() {
		return endDate.get();
	}
	
	public void setEndDate(String eDate) {
		endDate.set(eDate);
	}
	
	public String getDetails() {
		return details.get();
	}
	
	public void setDetails(String det) {
		details.set(det);
	}
	
}
