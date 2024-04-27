import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class conexion {
    public conexion(){
    }

    public void prueba() throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/4bf215b7e098101023afb8cc/latest/CRC"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);       

        Gson gson = new Gson();
        Moneda nuevoCambio = gson.fromJson(json, Moneda.class);
        System.out.println("Cambio colon: "+nuevoCambio.getBase());
    }
}
