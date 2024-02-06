package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class convertitore extends Application{
	
	Label lConvertire= new Label(" n° da convertire ");
	Label lBase= new Label(" base ");
	Label lNumero= new Label(" numero c. ");
	TextField tConvertire= new TextField();
	TextField tBase= new TextField();
	

	
	
	public void start(Stage finestra) {
	
	GridPane griglia= new GridPane();
	
	
	griglia.add(lConvertire, 0, 0);
	griglia.add(tConvertire, 1, 0);
	griglia.add(lBase, 0, 1);
	griglia.add(tBase, 1, 1);
	griglia.add(lNumero,0,2);
	
	
	
	
	
	
	
	
	
	
	
	
	
		Scene scena = new Scene(griglia);

		finestra.setTitle("Prima Interfaccia");
		finestra.setScene(scena);
		finestra.show();
	
	
	
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
