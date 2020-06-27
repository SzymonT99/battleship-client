package com.java.gra_w_statki.Kontrolery;

import com.google.gson.Gson;
import com.java.gra_w_statki.Model.Pole;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpClientGET {

    public Pole wykonajStrzal(int id_pola) {

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("http://127.0.0.1:8080/api/statki/strzelaj/" + id_pola);
        Gson gson = new Gson();
        Pole polePrzeciwnika = new Pole();

        try {
            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            String json = EntityUtils.toString(entity);
            System.out.println("Odczytujemy JSON'a z serwera:");
            System.out.println(json);
            polePrzeciwnika = gson.fromJson(json, Pole.class);

            System.out.println("Kod odpowiedzi serwera: " + response.getStatusLine().getStatusCode());
            if (response.getStatusLine().getStatusCode() == 404) {
                System.out.println("Błąd");
            } else if (response.getStatusLine().getStatusCode() == 200) {
                System.out.println("OK");

            }
        } catch (IOException var) {
            System.out.println("Houston, we have a problem with GET");
            var.printStackTrace();
        }

        return polePrzeciwnika;
    }

    public Integer otrzymajStrzal() {

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("http://127.0.0.1:8080/api/statki/obrona");
        Gson gson = new Gson();
        Pole pom = new Pole();
        Integer idAtakowanegoPola = 0;

        try {
            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            String json = EntityUtils.toString(entity);
            pom = gson.fromJson(json, Pole.class);
            idAtakowanegoPola = pom.getId();
            System.out.println("Atak przeciwnika na id Pola: " + idAtakowanegoPola);

            System.out.println("Kod odpowiedzi serwera: " + response.getStatusLine().getStatusCode());
            if (response.getStatusLine().getStatusCode() == 404) {
                System.out.println("Błąd");
            } else if (response.getStatusLine().getStatusCode() == 200) {
                System.out.println("OK");
            }
        } catch (IOException var) {
            System.out.println("Houston, we have a problem with GET");
            var.printStackTrace();
        }
        return idAtakowanegoPola;
    }
}