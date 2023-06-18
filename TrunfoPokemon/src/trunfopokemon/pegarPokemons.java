package trunfopokemon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Random;

public class pegarPokemons {
    
    
    private static int id;
    private static String name;
    private static int height;
    private static int weight;
    private static int attack;
    private static final Logger logger = Logger.getLogger(pegarPokemons.class.getName());
    
    
public static void getPokemons() {
    try {
        Random random = new Random();
        int randomPokemonId = random.nextInt(898) + 1;

        String apiUrl = "https://pokeapi.co/api/v2/pokemon/" + randomPokemonId;

        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder responseContent = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            responseContent.append(line);
        }
        reader.close();

        JSONObject pokemonDetails = new JSONObject(responseContent.toString());
        int pokemonId = pokemonDetails.getInt("id");
        String pokemonName = pokemonDetails.getString("name");
        int pokemonHeight = pokemonDetails.getInt("height");
        int pokemonWeight = pokemonDetails.getInt("weight");
        JSONArray typesArray = pokemonDetails.getJSONArray("types");
        List<String> pokemonTypes = new ArrayList<>();
        String imageUrl = pokemonDetails.getJSONObject("sprites").getString("front_default");

        for (int i = 0; i < typesArray.length(); i++) {
            JSONObject typeObject = typesArray.getJSONObject(i);
            JSONObject typeDetails = typeObject.getJSONObject("type");
            String typeName = typeDetails.getString("name");
            pokemonTypes.add(typeName);
        }

        JSONObject speciesObject = pokemonDetails.getJSONObject("species");
        String speciesName = speciesObject.getString("name");

        JSONArray statsArray = pokemonDetails.getJSONArray("stats");
        int pokemonAttack = 0;
        int pokemonDefense = 0;
        int pokemonSpeed = 0;
        int pokemonSpecialAttack = 0;

        for (int i = 0; i < statsArray.length(); i++) {
            JSONObject statObject = statsArray.getJSONObject(i);
            JSONObject statDetails = statObject.getJSONObject("stat");
            String statName = statDetails.getString("name");
            int baseStat = statObject.getInt("base_stat");

            switch (statName) {
                case "attack":
                    pokemonAttack = baseStat;
                    break;
                case "defense":
                    pokemonDefense = baseStat;
                    break;
                case "speed":
                    pokemonSpeed = baseStat;
                    break;
                case "special-attack":
                    pokemonSpecialAttack = baseStat;
                    break;
                default:
                    break;
            }
        }
            id = pokemonId;
            name = pokemonName;
            height = pokemonHeight;
            weight = pokemonWeight;
            attack = pokemonAttack;

    } catch (MalformedURLException ex) {
        logger.log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        logger.log(Level.SEVERE, null, ex);
    }
}

    public static int getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public static int getHeight() {
        return height;
    }

    public static int getWeight() {
        return weight;
    }

    public static int getAttack() {
        return attack;
    }
  
}