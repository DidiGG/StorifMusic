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
	private ModelFactoryController modelFactoryController;

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

		modelFactoryController = new ModelFactoryController();
		modelFactoryController.inicializarDatos();
		miApp.showStorifUser();
	}

	
	
	/**
	 * Lanza la vista de la ventana registro
	 * @param event
	 */
	@FXML
	void RegistrarseAction(ActionEvent event) {
		miApp.showRegistro();
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

	public void initialize(URL location, ResourceBundle resources) {
		modelFactoryController = ModelFactoryController.getInstance();

	}

}
