package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Fields {
	SimpleStringProperty fieldName;
	SimpleStringProperty startDate;
	SimpleStringProperty endDate;
	SimpleStringProperty ownerName;
	SimpleStringProperty streetAndNr;
	SimpleStringProperty plzAndCity;
	SimpleDoubleProperty flaeche; 
	SimpleStringProperty paechter;
	
	Fields(String fName, String sDate, String eDate, String owner, String sAN, String pAC, Double fla, String pae) {
		this.fieldName = new SimpleStringProperty(fName);
		this.startDate = new SimpleStringProperty(sDate);
		this.endDate = new SimpleStringProperty(eDate);
		this.ownerName = new SimpleStringProperty(owner);
		this.streetAndNr = new SimpleStringProperty(sAN);
		this.plzAndCity = new SimpleStringProperty(pAC);
		this.flaeche = new SimpleDoubleProperty(fla);
		this.paechter= new SimpleStringProperty(pae);
		
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
	public String getOwnerName() {
		return ownerName.get();
	}

	public void setOwnerName(String owner) {
		ownerName.set(owner); 
	}

	public String getStreetAndNr() {
		return streetAndNr.get();
	}

	public void setStreetAndNr(String sAN) {
		streetAndNr.set(sAN);
	}

	public String getPlzAndCity() {
		return plzAndCity.get();
	}

	public void setPlzAndCity(String pAC) {
		plzAndCity.set(pAC);
	}
	public Double getFlaeche() {
		return flaeche.get();
	}
	
	public void setFlaeche(Double fla) {
		flaeche.set(fla);
	}
	public String getPaechter() {
		return paechter.get();
	}

	public void setPaechter(String pae) {
		plzAndCity.set(pae);
	}
	
	
	
	
	
}
