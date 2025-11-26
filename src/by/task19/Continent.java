package by.task19;

public enum Continent {
    AFRICA ("Африка"),
    ANTARCTICA ("Антарктика"),
    ASIA ("Азия"),
    AUSTRALIA ("Австралия"),
    EUROPE ("Европа"),
    NORTH_AMERICA ("Северная Америка"),
    SOUTH_AMERICA ("Южная Америка");

    private String title;

    private Continent(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
