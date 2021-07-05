module PortfolioGUI {
	exports application;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	
	// is necessary to display the table view
	// DON'T REMOVE, APP WILL STOP WORKING!!!
	opens application to javafx.graphics, javafx.fxml, javafx.base;
}