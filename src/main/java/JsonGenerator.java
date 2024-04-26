import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonGenerator {

    public void generateJson(List<Pokemon> pokemons) throws IOException {
        FileWriter writer = new FileWriter("pokemons.txt");

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        writer.write(gson.toJson(pokemons));
        writer.close();
    }
}
