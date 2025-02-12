package horaDaPratica.api;

import br.alura.screenmatch.models.Book;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainGBooksAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert book title to search for: ");
        var bookTitle = sc.nextLine();
        bookTitle = bookTitle.strip();
        bookTitle = bookTitle.replaceAll(" ", "_");

        String googleApiKey = "AIzaSyBlH70i3KThMy63ZbrmhhEyilFov0FZI_8";
        String url = "https://www.googleapis.com/books/v1/volumes?q="+bookTitle+"&key="+googleApiKey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(url);
        System.out.println(response.body());
        Book newBook;
        Gson gson = new Gson();
        newBook = gson.fromJson(response.body(), Book.class);

        /*
         * In this case the response.body has levels therefore it's necessary to create
         * the levels in sequence to copy data to the object Book
         */
        System.out.println(newBook);

    }
}
