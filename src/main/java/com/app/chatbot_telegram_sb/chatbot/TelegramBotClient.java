package com.app.chatbot_telegram_sb.chatbot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import com.app.chatbot_telegram_sb.properties.TelegramProperties;
import com.app.chatbot_telegram_sb.service.MessageEconomicIndicatorsService;

/**
 * La clase TelegramBotClient.
 */
@Component
public class TelegramBotClient extends TelegramLongPollingBot {

	/** La constante LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(TelegramBotClient.class);

	/** Inyeccion de la dependecia ("Cableado automatico" de la clase). */
	@Autowired
	TelegramProperties prop;
	
	/** Inyeccion de la dependecia ("Cableado automatico" de la clase). */
	@Autowired
	MessageEconomicIndicatorsService messageEconomicIndicator;

	/**
	 * Metodo que se encarga de recibir y enviar el mensaje.
	 *
	 * @param update the update
	 */
	@Override
	public void onUpdateReceived(Update update) {

		LOGGER.info("Verificando mensaje en chat");
		
		// Verifica si existe mensaje
		if (update.hasMessage() && update.getMessage().hasText()) {
			
			LOGGER.info("Obteniendo mensaje");
			//Obteniendo mensaje
			String message = update.getMessage().getText();
			String messajeToSend = messageEconomicIndicator.messageToSendTelegram(message);
			
			LOGGER.info("Enviando mensaje segun opcion");
			//Genera la informacion a enviar
			SendMessage sendMessage = new SendMessage()
					.setChatId(update.getMessage().getChatId())
					.setText(messajeToSend);
			try {
				//Envia el mensaje
				execute(sendMessage);
				LOGGER.info("Mensaje enviado");
			} catch (TelegramApiException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Gets nombre del bot.
	 *
	 * @return el nombre del bot
	 */
	@Override
	public String getBotUsername() {
		return prop.getBotname();
	}

	/**
	 * Gets el token.
	 *
	 * @return el token
	 */
	@Override
	public String getBotToken() {
		return prop.getTelegramToken();
	}
}
