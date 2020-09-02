package com.app.chatbot_telegram_sb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * La clase Indicador.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Indicador {

	/** El numero de version. */
	private String version;
	
	/** El autor. */
	private String autor;
	
	/** La fecha. */
	private String fecha;
	
	/** el dolar. */
	private Dolar dolar;
	
	/** el euro. */
	private Euro euro;
	
	/** la uf. */
	private Uf uf;
	
	/** el utm. */
	private Utm utm;
	
	/**
	 * Contructor vacio de Respuesta.
	 */
	public Indicador() {}

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
	 * Gets the dolar.
	 *
	 * @return the dolar
	 */
	public Dolar getDolar() {
		return dolar;
	}

	/**
	 * Sets el dolar.
	 *
	 * @param dolar el nuevo dolar
	 */
	public void setDolar(Dolar dolar) {
		this.dolar = dolar;
	}

	/**
	 * Gets el euro.
	 *
	 * @return el euro
	 */
	public Euro getEuro() {
		return euro;
	}

	/**
	 * Sets el euro.
	 *
	 * @param euro el nuevo euro
	 */
	public void setEuro(Euro euro) {
		this.euro = euro;
	}

	/**
	 * Gets la uf.
	 *
	 * @return la uf
	 */
	public Uf getUf() {
		return uf;
	}

	/**
	 * Sets la uf.
	 *
	 * @param uf la nueva uf
	 */
	public void setUf(Uf uf) {
		this.uf = uf;
	}

	/**
	 * Gets el utm.
	 *
	 * @return el utm
	 */
	public Utm getUtm() {
		return utm;
	}

	/**
	 * Sets el utm.
	 *
	 * @param utm the el utm
	 */
	public void setUtm(Utm utm) {
		this.utm = utm;
	}

	
	/**
	 * Metodo To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Indicador [version=" + version + ", autor=" + autor + ", fecha=" + fecha + ", dolar=" + dolar
				+ ", euro=" + euro + ", uf=" + uf + ", utm=" + utm + "]";
	}

}
