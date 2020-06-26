package com.java.gra_w_statki.Kontrolery;

import com.google.gson.Gson;
import com.java.gra_w_statki.Model.Pole;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class HttpClientPOST {

    public void odpowiedzNaStrzal(Pole poleGracza) {
        final CloseableHttpClient client = HttpClients.createDefault();
        final HttpPost httpPost = new HttpPost("http://127.0.0.1:8080/api/statki/odpowiedz_na_strzal_przeciwnika");

        Gson gson = new Gson();

        // Serializacja obiektu do JSONa
        final String json = gson.toJson(poleGracza);

        try {
            final StringEntity entity = new StringEntity(json);
            httpPost.setEntity(entity);
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");

            final CloseableHttpResponse response = client.execute(httpPost);

            System.out.println("Kod odpowiedzi serwera: " + response.getStatusLine().getStatusCode());

            if(response.getStatusLine().getStatusCode() == 404) {

                System.out.println("Sciezka jest nieprawidlowa!");
            } else if(response.getStatusLine().getStatusCode() == 201) {
            }
            client.close();
        } catch (UnsupportedEncodingException e) {

            System.out.println("Houston, we have a problem with POST unsupported encoding");
            e.printStackTrace();
        } catch (ClientProtocolException e) {

            System.out.println("Houston, we have a problem with POST client protocol");
            e.printStackTrace();
        } catch (IOException e) {

            System.out.println("Houston, we have a problem with POST input output");
            e.printStackTrace();
        }
    }

}
