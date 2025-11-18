package by.task13.enums;

public enum FacultyAct {
    ACTIVE ("Активный факультет"),
    NOT_ACTIVE("Неактивныый факультет");

    private String type;

    FacultyAct (String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
