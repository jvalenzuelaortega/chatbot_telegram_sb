package com.app.chatbot_telegram_sb.service.impl;

import java.time.Duration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.chatbot_telegram_sb.model.Indicador;
import com.app.chatbot_telegram_sb.service.IndicadorApiService;

/**
 * La clase IndicadorApiServiceImpl.
 */
@Service
public class IndicadorApiServiceImpl implements IndicadorApiService{

	/** Instancia de restTemplate. */
	private final RestTemplate restTemplate;
	
	/**
	 * Constructor de IndicadorApiServiceImpl.
	 *
	 * @param restTemplateBuilder the rest template builder
	 */
	public IndicadorApiServiceImpl(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder
				.setConnectTimeout(Duration.ofSeconds(500))
				.setReadTimeout(Duration.ofSeconds(500))
				.build();
	}

	/**
	 * Metodo que trae los indicadores de la api mediante RestTemplate
	 * de Spring Boot.
	 *
	 * @param url the url
	 * @return el objecto indicador
	 */
	@Override
	public Indicador getIndicadorApi(String url) {
		Indicador indicador = new Indicador();
		try {
			indicador = restTemplate.getForObject(url, Indicador.class);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return indicador;
	}

}
