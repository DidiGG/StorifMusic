package co.uniquindio.storif.controllers;

import co.uniquindio.storif.Aplication;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginController {

	Aplication miApp;
	private Stage primaryStage;
	RegistroController registro;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button ingresarBtm;

	@FXML
	private Button registrarseBtm;

	@FXML
	private TextArea txtPass;

	@FXML
	private TextArea txtUsser;

	@FXML
	void IngresoAction(ActionEvent event) {

	}

	@FXML
	void RegistrarseAction(ActionEvent event) {
		miApp.showRegistro();
	}

	@FXML
	void initialize() {
		assert ingresarBtm != null : "fx:id=\"ingresarBtm\" was not injected: check your FXML file 'Login.fxml'.";
		assert registrarseBtm != null : "fx:id=\"registrarseBtm\" was not injected: check your FXML file 'Login.fxml'.";
		assert txtPass != null : "fx:id=\"txtPass\" was not injected: check your FXML file 'Login.fxml'.";
		assert txtUsser != null : "fx:id=\"txtUsser\" was not injected: check your FXML file 'Login.fxml'.";

	}

	public void setAplicacion(Aplication aplicacion) {
		this.miApp = aplicacion;
	}

	public Stage getStage() {
		return primaryStage;
	}

	public void setStage(Stage stage) {
		this.primaryStage = stage;
	}

}
