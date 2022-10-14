package co.uniquindio.storif.model;

public class Administrador {

	private String userName;
	private String contrasenia;

	/**
	 * Default constructor
	 */
	public Administrador() {

	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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

	@Override
	public String toString() {
		return "Administrador [userName=" + userName + ", contrasenia=" + contrasenia + "]";
	}
	
	

}
