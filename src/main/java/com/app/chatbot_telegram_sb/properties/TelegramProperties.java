package com.app.chatbot_telegram_sb.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * La clase TelegramProperties.
 */
@Configuration
@PropertySource("classpath:telegram.properties")
public class TelegramProperties {

    /** El nombre del bot extraida por properties. */
    @Value("${telegram.botname}")
    private String botname;

    /** El token extraida por properties.. */
    @Value("${telegram.token}")
    private String botToken;

    /**
     * Gets el nombre del bot.
     *
     * @return the nombre del bot
     */
    public String getBotname() {
        return botname;
    }

    /**
     * Gets el token de telegram.
     *
     * @return el token
     */
    public String getTelegramToken() {
        return botToken;
    }

}
