package com.app.chatbot_telegram_sb.model;

/**
 * La clase Indicador.
 */
public class Respuesta {

	/** El numero de version. */
	private String version;
	
	/** El autor. */
	private String autor;
	
	/** La fecha. */
	private String fecha;
	
	/** El indicador. */
	private Object indicador;
	
	/**
	 * Contructor vacio de Respuesta.
	 */
	public Respuesta() {}

	/**
	 * Gets la version.
	 *
	 * @return la version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets la version.
	 *
	 * @param version la nueva version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Gets el autor.
	 *
	 * @return el autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Sets el autor.
	 *
	 * @param autor la nueva autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Gets la fecha.
	 *
	 * @return la fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * Sets la fecha.
	 *
	 * @param fecha la nueva fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * Gets el indicador.
	 *
	 * @return el indicador
	 */
	public Object getIndicador() {
		return indicador;
	}

	/**
	 * Sets el indicador.
	 *
	 * @param indicador el nuevo indicador
	 */
	public void setIndicador(Object indicador) {
		this.indicador = indicador;
	}

	/**
	 * Metodo To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Indicador [version=" + version + ", autor=" + autor + ", fecha=" + fecha + ", indicador=" + indicador
				+ "]";
	}
	
}
