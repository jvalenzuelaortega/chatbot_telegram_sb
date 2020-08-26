package com.app.chatbot_telegram_sb.chatbot;

import com.app.chatbot_telegram_sb.properties.TelegramProperties;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
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
			
			//Genera la informacion a enviar
			SendMessage message = new SendMessage()
					.setChatId(update.getMessage().getChatId())
					.setText(update.getMessage().getText());
			try {
				//Envia el mensaje
				execute(message);
			} catch (TelegramApiException e) {
				e.printStackTrace();
				LOGGER.info("Error "+ e);
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
