package com.app.chatbot_telegram_sb.scraping;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Scraping {

    private static final String URL_SCRAPING = "https://www.dolaronline.cl/";

    public static String getDataOfElementHTML(String elementClass){
        String element = "";
        if(getStatusCodeConnection(URL_SCRAPING) == 200 ){
            Document document = getHTMLDocument(URL_SCRAPING);
            element = document.getElementsByClass(elementClass).text();
        }
        return element;
    }

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
