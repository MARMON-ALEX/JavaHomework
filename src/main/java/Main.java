public class Main {
    public static void main(String[] args) {
        Scientist crazyScientist = new Scientist(
                "Рик Санчез",
                200,
                "Wubba Lubba Dub Dub!");

        System.out.println("Имя ученого: " + crazyScientist.getName());
        System.out.println("Уровень интеллекта: " + crazyScientist.getIntelligenceLevel());
        System.out.println("Фраза: " + crazyScientist.getCatchphrase());

        ClassLoader classLoader = Scientist.class.getClassLoader();
        System.out.println("Класс загружен загрузчиком: " + classLoader);
        System.out.println("Имя класса: " + Scientist.class.getName());
    }
}