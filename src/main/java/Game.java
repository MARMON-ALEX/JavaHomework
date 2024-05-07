import java.io.Serializable;

public class Game implements Serializable {
    private String name;
    private int releaseYear;

    public Game(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Game [name=" + name + ", releaseYear=" + releaseYear + "]";
    }
}
