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

	public void calcola() {

		int numero;
		int base;
		String risposta = "";

		numero = Integer.parseInt(tConvertire.getText());
		base = Integer.parseInt(tBase.getText());
		HashTable <Int,String> my_dict = new HashTable <Int,String>();
		my_dict.put(10,"A")
		my_dict.get(10)
		my_dict.put(11,"B")
		my_dict.get(11)
		my_dict.put(12,"C")
		my_dict.get(12)
		my_dict.put(13,"D")
		my_dict.get(13)
		my_dict.put(14,"E")
		my_dict.get(14)
		my_dict.put(15,"F")
		my_dict.get(15)
		int resto = 0;
		String s = " ";
		for(int i=0;numero>0;i++) {
			resto=numero;
			numero=numero/base;
			resto=resto-(numero*base);
			s=resto+s;
		}
		lNumeroC.setText(risposta);
		
	}
		

	

	public static void main(String[] args) {
		launch(args);
	}
}
