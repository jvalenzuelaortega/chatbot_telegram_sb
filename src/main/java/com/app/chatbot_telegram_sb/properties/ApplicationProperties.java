package com.app.chatbot_telegram_sb.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// TODO: Auto-generated Javadoc
/**
 * La clase ApplicationProperties.
 */
@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationProperties {

	/** la url api. */
	@Value("${urlApi}")
	private String urlApi;
	
	/** la url api. */
	@Value("${response.message}")
	private String responseMessage;


	/**
	 * Gets la url api.
	 *
	 * @return la url api
	 */
	public String getUrlApi() {
		return urlApi;
	}


	/**
	 * Gets el mensaje de respuesta.
	 *
	 * @return el mensaje de respuesta
	 */
	public String getResponseMessage() {
		return responseMessage;
	}
	
	
}
