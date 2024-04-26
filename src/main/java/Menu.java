import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    ReaderAPI readerAPI = new ReaderAPI();
    JsonGenerator jsonGenerator = new JsonGenerator();
    List<Pokemon> pokemons = new ArrayList<>();
    public void showMenu() throws IOException, InterruptedException {
            boolean opc = true;
            Scanner scanner = new Scanner(System.in).useDelimiter("\n");

            do{
                System.out.println("Ingrese un pokemon a agregar: ");
                System.out.println("O escriba 'salir' para salir");
                String chosen = scanner.next();

                try {
                    if (!chosen.equalsIgnoreCase("salir"))pokemons.add(readerAPI.readPokeApi(chosen));
                    else opc = false;
                } catch (Exception e){
                    System.err.println("No se pudo encontrar el pokemon");
                }

            }while(opc);

            jsonGenerator.generateJson(pokemons);
        }
}
