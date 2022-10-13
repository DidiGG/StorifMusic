package co.uniquindio.storif.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.uniquindio.storif.Aplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class RegistroController {

	Aplication miApp;
	private Stage stage;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button registroBtm;

	@FXML
	private Button registroBtm1;

	@FXML
	private TextArea txtEmail;

	@FXML
	private TextArea txtPass;

	@FXML
	private TextArea txtUser;

	@FXML
	void registroAction(ActionEvent event) {

	}

	@FXML
	void initialize() {
		assert registroBtm != null : "fx:id=\"registroBtm\" was not injected: check your FXML file 'Registro.fxml'.";
		assert registroBtm1 != null : "fx:id=\"registroBtm1\" was not injected: check your FXML file 'Registro.fxml'.";
		assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'Registro.fxml'.";
		assert txtPass != null : "fx:id=\"txtPass\" was not injected: check your FXML file 'Registro.fxml'.";
		assert txtUser != null : "fx:id=\"txtUser\" was not injected: check your FXML file 'Registro.fxml'.";

	}

	public void setAplicacion(Aplication aplicacion) {
		this.miApp = aplicacion;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

}
