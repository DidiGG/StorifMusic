package co.uniquindio.storif.model;

import java.util.ArrayList;
import java.util.LinkedList;

public class Storif {

	
	String c;
	String nombre;
	ArrayList<Usuario> listaUsuario = new ArrayList<>();
	ArrayList<Administrador> adminStorif = new ArrayList<>();
	LinkedList<Canciones> listaGeneralCanciones = new LinkedList<>();

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
	 * Registro de usuario
	 * 
	 * @param userName
	 * @param pass
	 * @param email
	 * @returnm el usuario registrado, null si ya existe en la lista de usuarios
	 */
	public Usuario registarUsuario(String userName, String pass, String email) {
		Usuario user = null;
		user = buscarUsuario(userName);

		if (user == null) {

			user.setUsername(userName);
			user.setContrasenia(pass);
			user.setEmail(email);

			getListaUsuario().add(user);
			System.out.println(listaUsuario);
			return user;
		} else {
			return null;
		}
	}

	/**
	 * metodo para buscar un usario en la lista de usuarios
	 * 
	 * @param userName
	 * @return ausuario en la lista
	 */
	private Usuario buscarUsuario(String userName) {
		for (Usuario user : listaUsuario) {
			if (user.getUsername().equals(userName)) {
				return user;
			}
		}
		return null;
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

	/**
	 * @return the listaGeneralCanciones
	 */
	public LinkedList<Canciones> getListaGeneralCanciones() {
		return listaGeneralCanciones;
	}

	/**
	 * @param listaGeneralCanciones the listaGeneralCanciones to set
	 */
	public void setListaGeneralCanciones(LinkedList<Canciones> listaGeneralCanciones) {
		this.listaGeneralCanciones = listaGeneralCanciones;
	}

	/**
	 * @return the adminStorif
	 */
	public ArrayList<Administrador> getAdminStorif() {
		return adminStorif;
	}

	/**
	 * @param adminStorif the adminStorif to set
	 */
	public void setAdminStorif(ArrayList<Administrador> adminStorif) {
		this.adminStorif = adminStorif;
	}

	@Override
	public String toString() {
		return "Storif [nombre=" + nombre + ", listaUsuario=" + listaUsuario + ", adminStorif=" + adminStorif
				+ ", listaGeneralCanciones=" + listaGeneralCanciones + "]";
	}
	
	
	
	
	
}
