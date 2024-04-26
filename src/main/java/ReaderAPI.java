import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ReaderAPI {
    HttpClient client = HttpClient.newHttpClient();
    public Pokemon readPokeApi(String chosen) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://pokeapi.co/api/v2/pokemon/" + chosen)).build();

        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        String pokemonJson = response.body();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        Pokemon pokemon = gson.fromJson(pokemonJson, Pokemon.class);

        return pokemon;
    }


}
