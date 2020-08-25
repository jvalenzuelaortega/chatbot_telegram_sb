package com.app.chatbot_telegram_sb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * La clase Indicador.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Dolar {

	/** El codigo. */
	private String codigo;
	
	/** El nombre. */
	private String nombre;
	
	/** La unidad medida. */
	private String unidadMedida;
	
	/** La fecha. */
	private String fecha;
	
	/** El valor. */
	private double valor;
	
	/**
	 * Contructor vacio de indicador.
	 */
	public Dolar() {}

	/**
	 * Gets el codigo.
	 *
	 * @return el codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Sets el codigo.
	 *
	 * @param codigo el nuevo codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Gets el nombre.
	 *
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets el nombre.
	 *
	 * @param nombre el nuevo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets la unidad medida.
	 *
	 * @return la unidad medida
	 */
	public String getUnidadMedida() {
		return unidadMedida;
	}

	/**
	 * Sets la unidad medida.
	 *
	 * @param unidadMedida la nueva unidad medida
	 */
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
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
	 * Gets el valor.
	 *
	 * @return el valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * Sets el valor.
	 *
	 * @param valor el nuevo valor
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Dolar [codigo=" + codigo + ", nombre=" + nombre + ", unidadMedida=" + unidadMedida + ", fecha=" + fecha
				+ ", valor=" + valor + "]";
	}
	
}
