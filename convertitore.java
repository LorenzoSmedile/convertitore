package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.util.*;


public class convertitore extends Application {

	Label lConvertire = new Label(" n° da convertire ");
	Label lBase = new Label(" basi partenza e arrivo ");
	Label lNumero = new Label(" numero c. ");
	Label lNumeroC = new Label();
	TextField tConvertire = new TextField();
	TextField tBase = new TextField();
	TextField tBase2 = new TextField();
	Button bCalcola = new Button("converti");

	public void start(Stage finestra) {

		GridPane griglia = new GridPane();

		griglia.add(lConvertire, 0, 0);
		griglia.add(tConvertire, 1, 0);
		griglia.add(lBase, 0, 1);
		griglia.add(tBase, 1, 1);
		griglia.add(tBase2, 1, 2);
		griglia.add(lNumero, 0, 3);
		griglia.add(lNumeroC, 0, 4);
		griglia.add(bCalcola, 1, 5);

		Scene scena = new Scene(griglia);

		finestra.setTitle("Convertitore");
		finestra.setScene(scena);
		finestra.show();

		bCalcola.setOnAction(e -> Calcola());

	}

	private void Calcola() {
		int valore = Integer.parseInt(tConvertire.getText());
		int base = Integer.parseInt(tBase.getText());
		Hashtable<Integer, String> my_dict= new Hashtable<Integer,String>();
		int Resto = 0;
		String s = "";
		
		my_dict.put(10, "A");
		my_dict.put(11, "B");
		my_dict.put(12, "C");
		my_dict.put(13, "D");
		my_dict.put(14, "E");
		my_dict.put(15, "F");
		if (base == 16) {
			while (valore > 0) {
				Resto = valore;
				valore = valore / base;
				Resto = Resto - (valore * base);
				if (Resto < 10) {
					s = Resto + s;
				}
				if (Resto == 10) {
					my_dict.get(10);
				}
				if (Resto == 11) {
					my_dict.get(11);
				}
				if (Resto == 12) {
					my_dict.get(12);
				}
				if (Resto == 13) {
					my_dict.get(13);
				}
				if (Resto == 14) {
					my_dict.get(14);
				}
				if (Resto == 15) {
					my_dict.get(15);
					
				}

			}

		} else {
			while (valore > 0) {
				Resto = valore;
				valore = valore / base;
				Resto = Resto - (valore * base);
				s = Resto + s;
			}

		}

		lNumeroC.setText(s);

	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
