package com.app.chatbot_telegram_sb.utils;

/**
 * La Clase TelegramUtils.
 */
public class TelegramUtils {

	/**
	 * Metodo que formatea el comando ingresado y lo deja en mayusculas
	 *
	 * @param command the command
	 * @return the string
	 */
	public static String formatCommand(String command) {
		String str = command;
		String formatCommand = str.replace("/", "").toUpperCase();
		return formatCommand;
	}
	
	/**
	 * Metodo que reemplaza los valores seleccionados por los valores
	 * extraidos de la api
	 *
	 * @param message el valor mensaje
	 * @param indicador el valor indicador
	 * @param fecha el valor fecha
	 * @param valor el valor
	 * @return el mensaje con los valores ya reemplazados
	 */
	public static String replaceValueOfMessage(String message, String indicador, String fecha, double valor ) {
		
		//Pase de double a String
		String parsedValor = String.valueOf(valor);
		String finalMessage = message.replace("{{indicador}}", indicador)
				.replace("{{fecha}}", fecha)
				.replace("{{valor}}", parsedValor);
		
		return finalMessage;
	}
}
