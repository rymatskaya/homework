package by.task14.enums;

public enum Sex {
    FAMALE ("Женский пол"),
    MALE("Мужской пол");

    private String type;

    Sex (String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

