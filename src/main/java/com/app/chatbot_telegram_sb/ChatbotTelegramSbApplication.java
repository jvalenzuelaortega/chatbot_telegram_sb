package com.app.chatbot_telegram_sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

import javax.annotation.PostConstruct;

/**
 * La Clase ChatbotTelegramSbApplication.
 */
@SpringBootApplication
public class ChatbotTelegramSbApplication {

    /**
     * Metodo que inicializa el chatbot.
     */
    @PostConstruct
    public void init(){
        ApiContextInitializer.init();
    }

    /**
     * Metodo main de Spring Boot
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ChatbotTelegramSbApplication.class, args);
    }
}
