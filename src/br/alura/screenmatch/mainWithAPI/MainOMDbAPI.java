package br.alura.screenmatch.mainWithAPI;

import br.alura.screenmatch.models.Title;
import br.alura.screenmatch.models.TitleOmdb;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainOMDbAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a movie title to search: ");
        System.out.print("You can try composite names.");
        var search = scanner.nextLine();
        search = search.strip();
        search = search.replace(" ", "_");

        String url = "https://www.omdbapi.com/?t="+search+"&apikey=4d76d7b0";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(url);
        System.out.println(response.body());

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        TitleOmdb titleOmdb = gson.fromJson(response.body(), TitleOmdb.class);
        System.out.println(titleOmdb);
        Title title = new Title(titleOmdb);
        System.out.println(title);

    }
}
