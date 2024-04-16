import java.util.ArrayList;
import java.util.List;


public class ListOfScientists {

    private static List<Scientist> scientists = new ArrayList<>();

    public static void addScientist(Scientist scientist) {
        scientists.add(scientist);
    }

    public static void displayScientistsInfo() {
        if (scientists.isEmpty()) {
            System.out.println("Нет информации о ученых.");
        } else {
            System.out.println("Информация о ученых:");
            for (Scientist scientist : scientists) {
                System.out.println("Имя: " + scientist.getName() + ", Уровень интеллекта: " + scientist.getIntelligenceLevel() + ", Фраза: " + scientist.getCatchphrase());
            }
        }
    }
}
