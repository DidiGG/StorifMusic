package co.uniquindio.storif.model;

import java.util.LinkedList;


public class Usuario {

	private String username;
	private String contrasenia;
	private String email;

	LinkedList<Canciones> listaCanciones = new LinkedList<>();

	public Usuario() {

	}

	public Usuario(String username, String contrasenia, String email) {
		this.username = username;
		this.contrasenia = contrasenia;
		this.email = email;
	}

	/**
	 * constructor pára el ejemplo base a login de nikolas
	 * 
	 * @param username
	 * @param contrasenia
	 */
	public Usuario(String username, String contrasenia) {
		this.username = username;
		this.contrasenia = contrasenia;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the contrasenia
	 */
	public String getContrasenia() {
		return contrasenia;
	}

	/**
	 * @param contrasenia the contrasenia to set
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the listaCanciones
	 */
	public LinkedList<Canciones> getListaCanciones() {
		return listaCanciones;
	}

	/**
	 * @param listaCanciones the listaCanciones to set
	 */
	public void setListaCanciones(LinkedList<Canciones> listaCanciones) {
		this.listaCanciones = listaCanciones;
	}

	/**
	 * Metodo que me permite agregra una cancion a la lista Del usuario
	 * 
	 * @param cancion
	 */
	public void agregarCancion(Canciones cancion) {
		if (!(listaCanciones.contains(cancion))) {
			listaCanciones.push(cancion);
		}
	}

	/**
	 * Funcion que crea una lista de busqueda de una cancion
	 * 
	 * @param nombreCancion cancion a buscar por su nombre
	 * @return lista con canciones del mismo nombre
	 */
	public LinkedList<Canciones> buscarCacionLF(String nombreCancion) {
		LinkedList<Canciones> resultadosBusqueda = new LinkedList<>();

		for (Canciones cancionAux : listaCanciones) {
			if ((nombreCancion.equals(cancionAux.getNombre()))) {
				resultadosBusqueda.push(cancionAux);
			}
		}
		return resultadosBusqueda;
	}

	public void reproducirCancion() {

	}

	@Override
	public String toString() {
		return "Usuario [username=" + username + ", contrasenia=" + contrasenia + ", email=" + email
				+ ", listaCanciones=" + listaCanciones.toString() + "]";
	}

}