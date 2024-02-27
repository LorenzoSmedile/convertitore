package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.util.*

public class convertitore extends Application {

	Label lConvertire = new Label(" n° da convertire ");
	Label lBase = new Label(" base ");
	Label lNumero = new Label(" numero c. ");
	Label lNumeroC = new Label();
	TextField tConvertire = new TextField();
	TextField tBase = new TextField();
	Button bCalcola = new Button("converti");

	public void start(Stage finestra) {

		GridPane griglia = new GridPane();

		griglia.add(lConvertire, 0, 0);
		griglia.add(tConvertire, 1, 0);
		griglia.add(lBase, 0, 1);
		griglia.add(tBase, 1, 1);
		griglia.add(lNumero, 0, 2);
		griglia.add(lNumeroC, 0, 3);
		griglia.add(bCalcola, 1, 4);

		Scene scena = new Scene(griglia);

		finestra.setTitle("Convertitore");
		finestra.setScene(scena);
		finestra.show();

		bCalcola.setOnAction(e -> calcola());

	}

	private void Calcola() {

		int valore = Integer.parseInt(tConvertire.getText());
		int base = Integer.parseInt(tBase.getText());
		int Resto = 0;
		String s = "";
		if (base == 16) {
			while (valore > 0) {
				Resto = valore;
				valore = valore / base;
				Resto = Resto - (valore * base);
				if (Resto < 10) {
					s = Resto + s;
				}

				if (Resto == 10) {
					s = "A" + s;
				}

				if (Resto == 11) {

					s = "B" + s;

				}

				if (Resto == 12) {

					s = "C" + s;

				}

				if (Resto == 13) {

					s = "D" + s;

				}

				if (Resto == 14) {

					s = "E" + s;

				}

				if (Resto == 15) {

					s = "F" + s;

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
