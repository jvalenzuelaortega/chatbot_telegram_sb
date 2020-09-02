package com.app.chatbot_telegram_sb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.chatbot_telegram_sb.model.Indicador;
import com.app.chatbot_telegram_sb.service.IndicadorApiService;

@SpringBootTest
public class IndicadorApiServiceTests {

	@Autowired
	IndicadorApiService api;
	
	@Test
	public void  testingApi() {
		Indicador indicador = new Indicador();
		
		indicador = api.getIndicadorApi("https://mindicador.cl/api");
		
		//Se realizara prueba usando el indicador dolar
		String codigo = indicador.getDolar().getCodigo();
		String fecha = indicador.getDolar().getFecha();
		String nombre = indicador.getDolar().getNombre();
		double valor = indicador.getDolar().getValor();
		
		assertThat(codigo).isEqualTo("dolar");
		assertThat(fecha).isEqualTo("2020-08-26T04:00:00.000Z");
		assertThat(nombre).isEqualTo("Dólar observado");
		assertThat(valor).isEqualTo(784.44);
	}
	
}
