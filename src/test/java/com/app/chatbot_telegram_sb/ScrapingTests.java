package com.app.chatbot_telegram_sb;

import com.app.chatbot_telegram_sb.scraping.Scraping;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScrapingTests {

    @Test
    public void testScraping(){
        int statusCode = Scraping.getStatusCodeConnection("https://www.dolaronline.cl/");
        assertEquals(statusCode, 200);

        String valueElementDateDollar = Scraping.getDataOfElementHTML("valor-dia");
        assertThat(valueElementDateDollar).isEqualTo("jueves, 13 de agosto de 2020");

        String valueElementValueDollar = Scraping.getDataOfElementHTML("vl-uf");
        assertThat(valueElementValueDollar).isEqualTo("792,69");
    }
}
