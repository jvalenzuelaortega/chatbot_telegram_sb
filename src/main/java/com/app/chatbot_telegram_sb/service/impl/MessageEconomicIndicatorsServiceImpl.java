package com.app.chatbot_telegram_sb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.chatbot_telegram_sb.enums.Indicadores;
import com.app.chatbot_telegram_sb.model.Indicador;
import com.app.chatbot_telegram_sb.properties.ApplicationProperties;
import com.app.chatbot_telegram_sb.service.IndicadorApiService;
import com.app.chatbot_telegram_sb.service.MessageEconomicIndicatorsService;
import com.app.chatbot_telegram_sb.utils.TelegramUtils;

/**
 * La Clase MessageEconomicIndicatorsServiceImpl.
 */
@Service
public class MessageEconomicIndicatorsServiceImpl implements MessageEconomicIndicatorsService{

	/** Inyeccion de la dependecia ("Cableado automatico" de la clase). */
	@Autowired
	IndicadorApiService indicadorApiService;
	
	/** Inyeccion de la dependecia ("Cableado automatico" de la clase). */
	@Autowired
	ApplicationProperties appProperties;
	
	/**
	 * Metodo que envia el mensaje de respuesta
	 *
	 * @param la variable comando
	 * @return el mensaje
	 */
	@Override
	public String messageToSendTelegram(String command) {	
		String message = "";
		String commandFormated = TelegramUtils.formatCommand(command);
		
		if(commandFormated.equals("DOLAR") || commandFormated.equals("EURO") || 
				commandFormated.equals("UF") || commandFormated.equals("UTM")) {
			
			Indicadores indicadores = Indicadores.valueOf(commandFormated);
			Indicador indicador = new Indicador();
			
			switch(indicadores) {
				case DOLAR:
					indicador = indicadorApiService.getIndicadorApi(appProperties.getUrlApi());				
					message = TelegramUtils.replaceValueOfMessage(appProperties.getResponseMessage(),
							indicador.getDolar().getCodigo(),
							indicador.getDolar().getFecha(), 
							indicador.getDolar().getValor());
					break;
				
				case EURO:
					indicador = indicadorApiService.getIndicadorApi(appProperties.getUrlApi());				
					message = TelegramUtils.replaceValueOfMessage(appProperties.getResponseMessage(),
							indicador.getEuro().getCodigo(),
							indicador.getEuro().getFecha(), 
							indicador.getEuro().getValor());
					break;
					
				case UF:
					indicador = indicadorApiService.getIndicadorApi(appProperties.getUrlApi());				
					message = TelegramUtils.replaceValueOfMessage(appProperties.getResponseMessage(),
							indicador.getUf().getCodigo(),
							indicador.getUf().getFecha(), 
							indicador.getUf().getValor());
					break;
					
				case UTM:
					indicador = indicadorApiService.getIndicadorApi(appProperties.getUrlApi());				
					message = TelegramUtils.replaceValueOfMessage(appProperties.getResponseMessage(),
							indicador.getUtm().getCodigo(),
							indicador.getUtm().getFecha(), 
							indicador.getUtm().getValor());
					break;
				
				default: 
	                message = "No encontrado. presiona \start para más informacion"; 
			}
			
		}else {
			message = appProperties.getWelcomeMessage1() +
					"\n"+ appProperties.getWelcomeMessage2() + 
					"\n"+ appProperties.getWelcomeMessage3();
		}
		
		
		return message;
	}
	

}
