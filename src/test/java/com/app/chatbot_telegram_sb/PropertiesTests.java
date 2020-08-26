package com.app.chatbot_telegram_sb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestPropertySource("classpath:application.properties")
@TestPropertySource("classpath:telegram.properties")
public class PropertiesTests {

	@Value("${urlApi}")
    private String apiUrl;
	
	@Value("${response.message}")
    private String message;
	
    @Value("${telegram.botname}")
    private String botname;

    @Test
    public void loadPropertiesTest(){
        assertThat(botname).isEqualTo("botdolar");
        assertThat(apiUrl).isEqualTo("https://mindicador.cl/api");
        assertThat(message).isEqualTo("El valor del {{indicador}} de hoy {{fecha}} es de {{valor}}");
        
        System.out.println(message);
    }
}
