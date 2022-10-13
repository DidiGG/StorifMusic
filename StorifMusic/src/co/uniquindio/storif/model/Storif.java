package co.uniquindio.storif.model;

import java.util.ArrayList;

public class Storif {

	String nombre;
	ArrayList<Usuario> listaUsuario = new ArrayList<>();

	public Storif() {
		super();
	}

	/**
	 * Verifica si un usuario existe en la lista de Usarios
	 * 
	 * @param user
	 * @return true si está en la lista, false si no está
	 */
	public boolean verificarUser(Usuario user) {
		for (Usuario usuario : listaUsuario) {
			if ((usuario.getUsername().equals(user.getUsername())
					&& usuario.getContrasenia().equals(user.getContrasenia()))) {
				return true;
			}
		}
		return false;
	}
	


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the listaUsuario
	 */
	public ArrayList<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	/**
	 * @param listaUsuario the listaUsuario to set
	 */
	public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

}
