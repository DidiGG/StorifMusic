package co.uniquindio.storif.controllers;

import java.util.ArrayList;

import co.uniquindio.storif.Aplication;
import co.uniquindio.storif.model.Administrador;
import co.uniquindio.storif.model.Artista;
import co.uniquindio.storif.model.Canciones;
import co.uniquindio.storif.model.Genero;
import co.uniquindio.storif.model.Storif;
import co.uniquindio.storif.model.Usuario;

public class ModelFactoryController {

	Storif storif = new Storif();
	Administrador admin = new Administrador();

	LoginController loginController;
	Aplication aplication;
	Usuario usuario;
	Artista artista;
	Canciones CancionActual;

	ArrayList<Usuario> listaUsuarios = new ArrayList<>();
	ArrayList<Administrador> listaAdmin = new ArrayList<>();

	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aqu� al ser protected
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}

	public static ModelFactoryController getInstance() {
		return SingletonHolder.eINSTANCE;
	}
	
    /**
     * Contructor de a clase ModelFactory
     */
	public ModelFactoryController() {
		admin.setUserName("admin");
		admin.setContrasenia("$aDmiN");

		storif.getAdminStorif().add(admin);

		if (storif == null) {
			System.out.println("App nula");
		}
	}

	
	/**
	 * Iniializamos datos de prueba
	 */
	public void inicializarDatos() {
		/**
		 * usuario 1
		 */

		Usuario usuario = new Usuario();
		usuario.setUsername("didi");
		usuario.setContrasenia("didi");
		usuario.setEmail("email.com");

		Canciones cancion = new Canciones();
		cancion.setNombre("CANCION 1");
		cancion.setAlbum("NN");
		cancion.setAnio("2012");
		cancion.setCodigo("1");
		cancion.setDuracion("120");
		cancion.setGenero(Genero.POP);
		cancion.setUrl("www.esunurl.com");

		Artista artista = new Artista();
		artista.setNombre("Gian");
		artista.setNacionalidad("Colombiano");
		artista.setCodigo("1");
		artista.setGrupo(false);

		artista.getCancionnesArtista().add(cancion);
		usuario.getListaCanciones().push(cancion);
		Artista artista2 = new Artista();
		artista2.setNombre("Lola");
		artista2.setNacionalidad("Argentina");
		artista2.setCodigo("2");
		artista2.setGrupo(false);

		storif.getListaUsuario().add(usuario);

		/**
		 * usuario 2
		 */

		usuario = new Usuario();
		usuario.setUsername("luisa");
		usuario.setContrasenia("lui");
		usuario.setEmail("email.com");

		Canciones cancion2 = new Canciones();
		cancion2.setNombre("CANCION2");
		cancion2.setAlbum("NN");
		cancion2.setAnio("2012");
		cancion2.setCodigo("2");
		cancion2.setDuracion("130");
		cancion2.setGenero(Genero.ELECTRONICA);
		cancion2.setUrl("www.esunurl.com");

		Canciones cancion3 = new Canciones();
		cancion3.setNombre("CANCION3");
		cancion3.setAlbum("NN");
		cancion3.setAnio("2012");
		cancion3.setCodigo("2");
		cancion3.setDuracion("130");
		cancion3.setGenero(Genero.ELECTRONICA);
		cancion3.setUrl("www.esunurl.com");

		Canciones cancion4 = new Canciones();
		cancion4.setNombre("CANCION3");
		cancion4.setAlbum("NN");
		cancion4.setAnio("2012");
		cancion4.setCodigo("2");
		cancion4.setDuracion("130");
		cancion4.setGenero(Genero.ELECTRONICA);
		cancion4.setUrl("www.esunurl.com");



		artista.getCancionnesArtista().push(cancion);
		artista.getCancionnesArtista().push(cancion2);
		artista2.getCancionnesArtista().push(cancion3);
		artista2.getCancionnesArtista().push(cancion4);

		usuario.getListaCanciones().push(cancion);
		usuario.getListaCanciones().push(cancion2);

		storif.getListaUsuario().add(usuario);
		storif.getListaGeneralCanciones().push(cancion);
		storif.getListaGeneralCanciones().push(cancion2);
		storif.getListaGeneralCanciones().push(cancion3);
		storif.getListaGeneralCanciones().push(cancion4);

		System.out.println("Lista de Usuarios " +storif.getListaUsuario());
		System.out.println("Admin de la APP "+storif.getAdminStorif());
		System.out.println("CAnciones App" + storif.getListaGeneralCanciones());
		System.out.println("Canciones Uusuario "+ usuario.getListaCanciones());
		

	}

}
