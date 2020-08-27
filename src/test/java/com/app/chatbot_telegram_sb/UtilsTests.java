package com.app.chatbot_telegram_sb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.app.chatbot_telegram_sb.utils.TelegramUtils;

public class UtilsTests {

	@Test
	public void utilsTest() {
		String command = "/dolar";
		String format = TelegramUtils.formatCommand(command);
		
		String message = "El valor del {{indicador}} de hoy {{fecha}} es de {{valor}} pesos chilenos";
		String messageFinal = TelegramUtils.replaceValueOfMessage(message, "dolar", "miercoles", 800.0);
		
		assertThat(format).isEqualTo("DOLAR");
		assertThat(messageFinal).isEqualTo("El valor del dolar de hoy miercoles es de 800 pesos chilenos");
	}
}
