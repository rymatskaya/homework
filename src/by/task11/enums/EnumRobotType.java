package by.task11.enums;

public enum EnumRobotType {

    BUILDER("Строитель"),
    SAPPER("Сапер") ,
    COOK("ПОвор");

    private String type;
    EnumRobotType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
