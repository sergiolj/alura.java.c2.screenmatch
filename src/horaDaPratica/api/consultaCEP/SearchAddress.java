package horaDaPratica.api.consultaCEP;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SearchAddress {
    private String cep;

    public Address searchFromPostalCode(String cep) {
        Address address = null;
        validateCep(cep);
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
            address = new Gson().fromJson(response.body(), Address.class);
        } catch (Exception e) {
            throw new RuntimeException("Unable to locate address from postal code. Check format information.", e);
        }
        return address;
    }

    public void validateCep(String cep) {
    }

}
