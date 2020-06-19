package com.java.gra_w_statki.Kontrolery;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

public class HttpClientGET {

    public void wykonajStrzal(int id_pola) {

        System.out.println("jestem");
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("http://127.0.0.1:8080/api/statki/strzelaj/" + id_pola);
        System.out.println(request);
        Gson gson = new Gson();

        try {
            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();

            System.out.println("Kod odpowiedzi serwera: " + response.getStatusLine().getStatusCode());
            if (response.getStatusLine().getStatusCode() == 404) {
                System.out.println("Błąd");
            } else if (response.getStatusLine().getStatusCode() == 200) {
                System.out.println("OK");

            }
        } catch (IOException var10) {
            System.out.println("Houston, we have a problem with GET");
            var10.printStackTrace();
        }

    }
}
