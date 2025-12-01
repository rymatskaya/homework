package by.task19;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    static void main() {
        StringInterface upper = (String str) -> str.toUpperCase();

        String result = upper.StrInt("Пример");
        System.out.println(result);
//        1.1. Создать города
        City city1 = new City(1, "Минск", 2150000, Continent.EUROPE);
        City city2 = new City(2, "Пекин", 10000000, Continent.ASIA);
        City city3 = new City(3, "Нью-Йорк", 3200000, Continent.NORTH_AMERICA);
        City city4 = new City(4, "Буэнос-Аерэс", 200000, Continent.SOUTH_AMERICA);
        City city5 = new City(5, "Каир", 1100000000, Continent.AFRICA);
        City city6 = new City(6, "Филодельфия", 120000000, Continent.NORTH_AMERICA);

        List<City> cities = List.of(city1, city2, city3, city4, city5, city6);
//      1.2. Найти самый густонаселённый город на континенте (filter по континенту+ max)
        System.out.println("Найти самый густонаселённый город на континенте");
        Optional<City> cityMaxPop = cities.stream().filter(city ->
                        city.getContinent().equals(Continent.NORTH_AMERICA))
                        .max(Comparator.comparingLong(City::getPopulation));

        if (cityMaxPop.isPresent()) {
            System.out.println("Самый густонаселенный город в " + Continent.NORTH_AMERICA + ": " + cityMaxPop.get());
        } else {
            System.out.println("Городов на континенте " + Continent.NORTH_AMERICA + " не найдено");
        };

//      1.3. Найти город, с минимальным населением на континенте. (filter по континенту+ min)
        System.out.println("Найти город, с минимальным населением на континенте");
        Optional<City> cityMinPop = cities.stream().filter(city ->
                        city.getContinent().equals(Continent.NORTH_AMERICA))
                .min(Comparator.comparingLong(City::getPopulation));

        if (cityMinPop.isPresent()) {
            System.out.println("Самый густонаселенный город в " + Continent.NORTH_AMERICA + ": " + cityMinPop.get());
        } else {
            System.out.println("Городов на континенте " + Continent.NORTH_AMERICA + " не найдено");
        };
//      1.4. Найти самый густонаселённый город (max)
        System.out.println("Найти самый густонаселённый город ");
        Optional<City> resultMaxPop = cities.stream().max(Comparator.comparing(City::getPopulation));
        if (resultMaxPop.isPresent()) {
            System.out.println(resultMaxPop.get());
        }
//      1.5. Найти город с самым маленьким населением. (min)
        System.out.println("Найти город с самым маленьким населением ");
        Optional<City> resultMinPop = cities.stream().min(Comparator.comparing(City::getPopulation));
        if (resultMinPop.isPresent()) {
            System.out.println(resultMinPop.get());
        }
//      1.6. Найти первый попавшиеся город, у которого население больше 1млн. (filter + findFirst).
        System.out.println("Найти первый попавшиеся город, у которого население больше 1млн. ");
        City city = cities.stream().filter(city7 -> {
            if (city7.getPopulation() > 1000000) {
                return true;
            } else return false;
        }).findFirst().orElseThrow(() -> new CityNotFoundException("Нет такого города!"));
        System.out.println(city);

//      1.7. Отобрать города с населением больше 1 млн. (filter)
        System.out.println("Отобрать города с населением больше 1 млн.");
        List<City> list = cities.stream().filter(city8 -> city8.getPopulation() > 1000000).toList();
        System.out.println(list);

//      1.8. Создать коллекцию из названий городов, на основании объектов (map)
        System.out.println("Создать коллекцию из названий городов, на основании объектов.");
        List<String> names = cities.stream().map(city7 -> {
            return city7.getName();
        }).distinct().toList();
        System.out.println(names);
    }
}
