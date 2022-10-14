package co.uniquindio.storif.model;

import java.util.LinkedList;

public class Artista {

	private String codigo;
	private String nombre;
	private String nacionalidad;
	boolean grupo;

	LinkedList<Canciones> cancionnesArtista = new LinkedList<>();

	public Artista() {

	}

	public Artista(String codigo, String nombre, String nacionalidad, boolean grupo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.grupo = grupo;

	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/**
	 * @return the grupo
	 */
	public boolean isGrupo() {
		return grupo;
	}

	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(boolean grupo) {
		this.grupo = grupo;
	}

	/**
	 * @return the cancionnesArtista
	 */
	public LinkedList<Canciones> getCancionnesArtista() {
		return cancionnesArtista;
	}

	/**
	 * @param cancionnesArtista the cancionnesArtista to set
	 */
	public void setCancionnesArtista(LinkedList<Canciones> cancionnesArtista) {
		this.cancionnesArtista = cancionnesArtista;
	}

	@Override
	public String toString() {
		return "Artista [codigo=" + codigo + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", grupo="
				+ grupo + ", cancionnesArtista=" + cancionnesArtista + "]";
	}

	
	
}
