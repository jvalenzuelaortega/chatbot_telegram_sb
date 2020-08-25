package com.app.chatbot_telegram_sb.component;

import com.app.chatbot_telegram_sb.properties.TelegramProperties;

import com.app.chatbot_telegram_sb.scraping.Scraping;
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

    	//Verifica si existe mensaje
        if (update.hasMessage() && update.getMessage().hasText()) {
            long chatId = update.getMessage().getChatId();
            String messageReceived = update.getMessage().getText();

            LOGGER.info("Se ha recibido pregunta del emisor");

            SendMessage message = new SendMessage();

            //Verifica si el mensaje contiene la palabra dolar
            if(messageReceived.contains("Dolar")){
                String dateAndDay = Scraping.getDataOfElementHTML("valor-dia");
                String value = Scraping.getDataOfElementHTML("vl-uf");

                message.setChatId(update.getMessage().getChatId());
                message.setText("Amigo. El valor del dolar correspondiente al dia "+ dateAndDay + " es de "+ value + " pesos");

                LOGGER.info("Se ha generado respuesta con informacion solicitada");
            
            //De no contener la palabra dolar envia otro mensaje por defecto
            }else{
                message.setChatId(update.getMessage().getChatId());
                message.setText("Amigo solo tengo información del dolar");

                LOGGER.info("Se ha generado respuesta solicitando datos");
            }

            try {
            	// Envia el mensaje
                execute(message);
                LOGGER.info("Se ha enviado respuesta al receptor");
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
