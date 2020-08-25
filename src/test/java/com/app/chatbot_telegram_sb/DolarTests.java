package com.app.chatbot_telegram_sb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.app.chatbot_telegram_sb.model.Dolar;
import com.app.chatbot_telegram_sb.model.Respuesta;

public class DolarTests {

	@Test
	public void testIndicador() {
		Dolar dolar = new Dolar();
		dolar.setCodigo("dolar");
		dolar.setNombre("Dolar");
		dolar.setUnidadMedida("Pesos");
		dolar.setFecha("2020-08-25T04:00:00.000Z");
		dolar.setValor(786.17);
		
		Respuesta respuesta = new Respuesta();
		respuesta.setVersion("1.6.0");
		respuesta.setAutor("mindicador.cl");
		respuesta.setFecha("2020-08-25T04:00:00.000Z");
		respuesta.setIndicador(dolar);
		
		assertThat(respuesta.getVersion().equals("1.6.0"));
		assertThat(respuesta.getAutor().equals("mindicador.cl"));
		assertThat(respuesta.getFecha().equals("2020-08-25T04:00:00.000Z"));
		assertThat(respuesta.getIndicador().equals(dolar));

		System.out.println("Valores del dolar :" +respuesta.toString());
	}
}
