package co.uniquindio.storif;

import java.io.IOException;

import co.uniquindio.storif.controllers.LoginController;
import co.uniquindio.storif.controllers.RegistroController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

public class Aplication extends Application {

	private Stage primaryStage;
	LoginController login;
	RegistroController registro;

	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Storif Music");
			showLogin();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void showLogin() {

		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplication.class.getResource("view/Login.fxml"));

			AnchorPane rootLayout = (AnchorPane) loader.load();
			login = loader.getController();
			login.setAplicacion(this);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Storif Music");

			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showRegistro() {

		System.out.println("Entro registro boton");

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplication.class.getResource("view/Registro.fxml"));

			AnchorPane rootLayout = (AnchorPane) loader.load();
			registro = loader.getController();
			registro.setAplicacion(this);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Storif Music");

			primaryStage.show();
		} catch (IOException e) {
			System.out.println("No carga la ventana");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * @return the primaryStage
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	/**
	 * @param primaryStage
	 *            the primaryStage to set
	 */
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

}