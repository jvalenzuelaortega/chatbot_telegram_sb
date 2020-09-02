package com.app.chatbot_telegram_sb.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * La Clase TelegramUtils.
 */
public class ApplicationsUtils {

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
	
	/**
	 * Metodo que formatea la fecha actual a String
	 * (Esto se debe a que el formato de fecha traido del servicio viene en un formato que se formateara más adelante)
	 *
	 * @return the string
	 */
	public static String dateTimeFormatted() {
		Locale locale =new Locale("es", "ES");
		LocalDate localDate = LocalDate.now();	
		String fecha = localDate.format(DateTimeFormatter.ofPattern("EEEE dd 'de' MMMM 'del' yyyy",locale));	
		return fecha;
	}
}
