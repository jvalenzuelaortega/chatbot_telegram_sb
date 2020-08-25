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
    private String telegramToken;

    /**
     * Gets el nombre del bot.
     *
     * @return the nombre del bot
     */
    public String getBotname() {
        return botname;
    }

    /**
     * Sets el nombre del bot.
     *
     * @param botname the new botname
     */
    public void setBotname(String botname) {
        this.botname = botname;
    }

    /**
     * Gets el token de telegram.
     *
     * @return el token
     */
    public String getTelegramToken() {
        return telegramToken;
    }

    /**
     * Sets el token de telegram.
     *
     * @param telegramToken the new telegram token
     */
    public void setTelegramToken(String telegramToken) {
        this.telegramToken = telegramToken;
    }

}
