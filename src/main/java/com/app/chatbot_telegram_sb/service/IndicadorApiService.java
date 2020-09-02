package com.app.chatbot_telegram_sb.service;

import com.app.chatbot_telegram_sb.model.Indicador;

/**
 * La Interface IndicadorApiService.
 */
public interface IndicadorApiService {

	/**
	 * Metodo que se encarga de traer los datos de la api
	 *
	 * @param url parametro URL de api
	 * @return el objeto indicador
	 */
	Indicador getIndicadorApi(String url);
}
