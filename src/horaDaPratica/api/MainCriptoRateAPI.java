package horaDaPratica.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainCriptoRateAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String key = "CG-z5rVNFcHKSFDb4QkPUao6Row";

        System.out.print("Inform Crypto Coin name: (bitcoin)(ethereum)");
        String digiCoin = sc.nextLine();
        System.out.print("Inform Real Coin name: ('usd' - US Dollar)/('gbp' - UKPounds)");
        String realCoin = sc.nextLine();

        String url = "https://api.coingecko.com/api/v3/simple/price?ids="+digiCoin+"&vs_currencies="+realCoin+"&x_cg_demo_api_key="+key;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(url);
        System.out.println(response.body());
    }
}
