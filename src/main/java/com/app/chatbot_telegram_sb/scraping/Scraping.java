package com.app.chatbot_telegram_sb.scraping;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * La clase Scraping.
 */
public class Scraping {

    /** La constante URL_SCRAPING. */
    private static final String URL_SCRAPING = "https://www.dolaronline.cl/";

    /**
     * Metodo que retorna el valor extraido de una clase CSS.
     *
     * @param elementClass el elemento de la clase
     * @return el valor del elemento de la clase
     */
    public static String getDataOfElementHTML(String elementClass){
        String element = "";
        if(getStatusCodeConnection(URL_SCRAPING) == 200 ){
            Document document = getHTMLDocument(URL_SCRAPING);
            element = document.getElementsByClass(elementClass).text();
        }
        return element;
    }

    /**
     * Metodo que retorna el documento HTML
     *
     * @param url la url
     * @return el documento HTML
     */
    public static Document getHTMLDocument(String url){
        Document document = null;
        try {
            document = Jsoup.connect(url)
                    .timeout(100000)
                    .get();
        }catch (IOException e){
            e.printStackTrace();
        }
        return document;
    }

    /**
     * Metodo que retorna el codigo de status de conexion a la pagina
     *
     * @param url la url
     * @return el estatus de la conexion
     */
    public static int getStatusCodeConnection(String url){
        Connection.Response response = null;
        try{
            response = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0")
                    .timeout(100000)
                    .ignoreHttpErrors(true)
                    .execute();

        }catch (IOException e){
            e.printStackTrace();
        }
        return response.statusCode();
    }
}
