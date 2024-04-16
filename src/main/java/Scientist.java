public class Scientist {

    private String name;
    private int intelligenceLevel;
    private String catchphrase;

    public Scientist(String name, int intelligenceLevel, String catchphrase){
        setName(name);
        setIntelligenceLevel(intelligenceLevel);
        setCatchphrase(catchphrase);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Bob";
            System.out.println("Имя не может быть пустым, будет Bob");
        }
    }

    public int getIntelligenceLevel() {
        return intelligenceLevel;
    }

    public void setIntelligenceLevel(int intelligenceLevel) {
        if (intelligenceLevel >= 0) {
            this.intelligenceLevel = intelligenceLevel;
        } else {
            this.intelligenceLevel = 3;
            System.out.println("Уровень интелекта не может быть отрицательным, будет 3");
        }
    }

    public String getCatchphrase() {
        return catchphrase;
    }

    public void setCatchphrase(String catchphrase) {
        if (catchphrase != null && !catchphrase.isEmpty()) {
            this.catchphrase = catchphrase;
        } else {
            this.catchphrase = "Kavabanga!";
            System.out.println("Фраза не может быть пустой, будет Kavabanga!");
        }
    }
}
