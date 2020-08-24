package com.app.chatbot_telegram_sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ChatbotTelegramSbApplication {

    @PostConstruct
    public void init(){
        ApiContextInitializer.init();
    }

    public static void main(String[] args) {
        SpringApplication.run(ChatbotTelegramSbApplication.class, args);
    }

}
