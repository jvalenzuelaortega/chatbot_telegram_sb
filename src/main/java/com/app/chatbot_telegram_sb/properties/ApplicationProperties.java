package com.app.chatbot_telegram_sb.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * La clase ApplicationProperties.
 */
@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationProperties {

	/** la url api. */
	@Value("${urlApi}")
	private String urlApi;
	
	/**el mensaje informativo. */
	@Value("${response.message}")
	private String responseMessage;
	
	/** el mensaje bienvenida. */
	@Value("${response.welcome.message.1}")
	private String welcomeMessage1;

	/** el mensaje bienvenida. */
	@Value("${response.welcome.message.2}")
	private String welcomeMessage2;
	
	/** el mensaje bienvenida. */
	@Value("${response.welcome.message.3}")
	private String welcomeMessage3;

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
	
	/**
	 * Gets el primer mensaje de bienvenida.
	 *
	 * @return tel primer mensaje de bienvenida
	 */
	public String getWelcomeMessage1() {
		return welcomeMessage1;
	}

	/**
	 * Gets el segundo mensaje de bienvenida.
	 *
	 * @return el segundo mensaje de bienvenida
	 */
	public String getWelcomeMessage2() {
		return welcomeMessage2;
	}

	/**
	 * Gets el tercer mensaje de bienvenida.
	 *
	 * @return el tercer mensaje de bienvenida
	 */
	public String getWelcomeMessage3() {
		return welcomeMessage3;
	}
}
