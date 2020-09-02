package com.app.chatbot_telegram_sb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.chatbot_telegram_sb.service.MessageEconomicIndicatorsService;

@SpringBootTest
public class MessageEconomicIndicatorServiceTests {

	@Autowired
	MessageEconomicIndicatorsService messageEconomic;
	
	@Test
	public void testMessage() {
		String command = "/dolar";
		String message = messageEconomic.messageToSendTelegram(command);
		
		assertThat(message).isEqualTo("El valor del dolar de hoy 2020-08-26T04:00:00.000Z es de $ 784.44 pesos chilenos");
	}
}
