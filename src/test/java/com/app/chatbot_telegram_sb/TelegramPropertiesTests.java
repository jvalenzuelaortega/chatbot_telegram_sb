package com.app.chatbot_telegram_sb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestPropertySource("classpath:application.properties")
public class TelegramPropertiesTests {

    @Value("${telegram.botname}")
    private String botname;

    @Value("${telegram.token}")
    private String telegramToken;

    @Test
    public void loadPropertiesTest(){
        assertThat(botname).isEqualTo("botdolar");
        assertThat(telegramToken).isEqualTo("1270979653:AAFyo7UKApsk7PIHG4rG-1mIz6SHy6xoxTM");
    }
}
