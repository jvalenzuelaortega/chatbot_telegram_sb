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
	
	@Value("${response.welcome.message.1}")
    private String welcome1;
	
	@Value("${response.welcome.message.2}")
    private String welcome2;
	
	@Value("${response.welcome.message.3}")
    private String welcome3;


    @Test
    public void loadPropertiesTest(){
        assertThat(apiUrl).isEqualTo("https://mindicador.cl/api");
        assertThat(message).isEqualTo("El valor del {{indicador}} de hoy {{fecha}} es de $ {{valor}} pesos chilenos");
        
        assertThat(welcome1).isEqualTo("Bienvenido al chatbot.");
        assertThat(welcome2).isEqualTo("A continuacion selecciona una de las palabras para obtener informacion.");
        assertThat(welcome3).isEqualTo("/dolar - /euro - /uf - /utm");
    }
}
