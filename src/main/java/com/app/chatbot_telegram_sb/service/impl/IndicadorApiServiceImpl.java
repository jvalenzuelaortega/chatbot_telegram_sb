package com.app.chatbot_telegram_sb.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.chatbot_telegram_sb.model.Indicador;
import com.app.chatbot_telegram_sb.service.IndicadorApiService;

/**
 * La clase IndicadorApiServiceImpl.
 */
@Service
public class IndicadorApiServiceImpl implements IndicadorApiService{

	/**
	 * Metodo que trae los indicadores de la api mediante RestTemplate
	 * de Spring Boot
	 *
	 * @param la url de la api
	 * @return el objecto indicador
	 */
	@Override
	public Indicador getIndicadorApi(String url) {
		Indicador indicador = new Indicador();
		try {
			RestTemplate restTemplate = new RestTemplate();
			indicador = restTemplate.getForObject(url, Indicador.class);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return indicador;
	}

}
