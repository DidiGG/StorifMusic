package co.uniquindio.storif.model;

public class Canciones {

	private String codigo;
	private String nombre;
	private String album;
	private String anio;
	private String duracion;
	private String url;
	Genero genero;

	public Canciones() {
	}

	public Canciones(String codigo, String nombre, String album, String anio, Genero genero, String duracion,
			String url) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.album = album;
		this.anio = anio;
		this.genero = genero;
		this.duracion = duracion;
		this.url = url;
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
	 * @return the album
	 */
	public String getAlbum() {
		return album;
	}

	/**
	 * @param album the album to set
	 */
	public void setAlbum(String album) {
		this.album = album;
	}

	/**
	 * @return the anio
	 */
	public String getAnio() {
		return anio;
	}

	/**
	 * @param anio the anio to set
	 */
	public void setAnio(String anio) {
		this.anio = anio;
	}

	/**
	 * @return the duracion
	 */
	public String getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Canciones [codigo=" + codigo + ", nombre=" + nombre + ", album=" + album + ", anio=" + anio
				+ ", duracion=" + duracion + ", url=" + url + ", genero=" + genero + "]";
	}

}
