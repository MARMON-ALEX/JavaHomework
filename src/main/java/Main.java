import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Game game = new Game("Final Fantasy", 30);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(game);

        try (FileWriter fileWriter = new FileWriter("game.json")) {
            fileWriter.write(json);
            System.out.println("Игра была успешно сериализована в файл game.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fileReader = new FileReader("game.json")) {
            Game deserializedGame = gson.fromJson(fileReader, Game.class);
            System.out.println("Объект успешно десериализован из файла:");
            System.out.println(deserializedGame);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
