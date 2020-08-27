package com.app.chatbot_telegram_sb.service;

/**
 * La Interface MessageEconomicIndicatorsService.
 */
public interface MessageEconomicIndicatorsService {

	/**
	 * Metodo que envia el mensaje de respuesta
	 *
	 * @param la variable comando
	 * @return el mensaje
	 */
	String messageToSendTelegram(String command);
}
