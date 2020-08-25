package com.app.chatbot_telegram_sb.component;

import com.app.chatbot_telegram_sb.properties.TelegramProperties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

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

	/**
	 * Metodo que se encarga de recibir y enviar el mensaje
	 *
	 * @param update the update
	 */
	@Override
	public void onUpdateReceived(Update update) {

		// Verifica si existe mensaje
		if (update.hasMessage() && update.getMessage().hasText()) {
			SendMessage message = new SendMessage() // Create a SendMessage object with mandatory fields
					.setChatId(update.getMessage().getChatId()).setText(update.getMessage().getText());
			try {
				execute(message); // Call method to send the message
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
	 * Gets el token
	 *
	 * @return el token
	 */
	@Override
	public String getBotToken() {
		return prop.getTelegramToken();
	}
}
