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

	public ModelFactoryController() {
		admin.setUserName("admin");
		admin.setContrasenia("$aDmiN");

		storif.getAdminStorif().add(admin);

		if (storif == null) {
			System.out.println("App nula");
		}
	}

	public void inicializarDatos() {
		/**
		 * usuario 1
		 */

		Usuario usuario = new Usuario();
		usuario.setUsername("didi");
		usuario.setContrasenia("didi");
		usuario.setEmail("email.com");

		Canciones cancion = new Canciones();
		cancion.setNombre("Entre tus manos");
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

		storif.getListaUsuario().add(usuario);

		/**
		 * usuario 2
		 */

		usuario = new Usuario();
		usuario.setUsername("luisa");
		usuario.setContrasenia("lui");
		usuario.setEmail("email.com");

		Canciones cancion2 = new Canciones();
		cancion2.setNombre("Bno se de ti");
		cancion2.setAlbum("NN");
		cancion2.setAnio("2012");
		cancion2.setCodigo("2");
		cancion2.setDuracion("130");
		cancion2.setGenero(Genero.ELECTRONICA);
		cancion2.setUrl("www.esunurl.com");

		artista = new Artista();
		artista.setNombre("Lola");
		artista.setNacionalidad("Argentina");
		artista.setCodigo("2");
		artista.setGrupo(false);

		artista.getCancionnesArtista().push(cancion);
		usuario.getListaCanciones().push(cancion);
		usuario.getListaCanciones().push(cancion2);

		storif.getListaUsuario().add(usuario);
		storif.getListaGeneralCanciones().push(cancion);
		
		
		System.out.println(storif.getListaUsuario());
		System.out.println(storif.getAdminStorif());
		

	}

}
