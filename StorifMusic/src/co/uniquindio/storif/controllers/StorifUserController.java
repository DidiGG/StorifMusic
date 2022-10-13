package co.uniquindio.storif.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class StorifUserController {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="btbAgregarCancion"
	private Button btbAgregarCancion; // Value injected by FXMLLoader

	@FXML // fx:id="btnCerrarSesion"
	private Button btnCerrarSesion; // Value injected by FXMLLoader

	@FXML // fx:id="btnPlay"
	private Button btnPlay; // Value injected by FXMLLoader

	@FXML // fx:id="tablaCancionesStorifUser"
	private TableView<?> tablaCancionesStorifUser; // Value injected by FXMLLoader

	@FXML
	void agregarCancionFav(ActionEvent event) {

	}

	@FXML
	void outSesion(ActionEvent event) {

	}

	@FXML
	void reproducirCancion(ActionEvent event) {

	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert btbAgregarCancion != null
				: "fx:id=\"btbAgregarCancion\" was not injected: check your FXML file 'StorifUser.fxml'.";
		assert btnCerrarSesion != null
				: "fx:id=\"btnCerrarSesion\" was not injected: check your FXML file 'StorifUser.fxml'.";
		assert btnPlay != null : "fx:id=\"btnPlay\" was not injected: check your FXML file 'StorifUser.fxml'.";
		assert tablaCancionesStorifUser != null
				: "fx:id=\"tablaCancionesStorifUser\" was not injected: check your FXML file 'StorifUser.fxml'.";

	}

}