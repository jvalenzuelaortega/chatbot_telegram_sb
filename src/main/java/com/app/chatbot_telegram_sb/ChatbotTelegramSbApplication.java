package com.app.chatbot_telegram_sb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.telegram.telegrambots.ApiContextInitializer;

import com.app.chatbot_telegram_sb.model.Dolar;

import javax.annotation.PostConstruct;

/**
 * La Clase ChatbotTelegramSbApplication.
 */
@SpringBootApplication
public class ChatbotTelegramSbApplication {

	/** La constante LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(ChatbotTelegramSbApplication.class);
	
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
    
    /**
     * Pruebas de Rest
     */

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
    	return builder.build();
    }
    
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) {
		return args -> {
			Dolar dolar = restTemplate.getForObject("https://mindicador.cl/api", Dolar.class);
			LOGGER.info(dolar.toString());
		};
    	
    }
}
