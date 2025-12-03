package by.task21;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

/**1. Вывести текущую дату в формате (пример формата: 1 апреля 2023). На выходе дата должна быть
 *  класса String
 2. Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM).
 На выходе дата должна быть класса String
 3. Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию:
 4. Перевести String (пн 20.03.23 г. время: 15:07:28  ) в формат LocalDateTime по умолчанию:
 5. *Вывести текущую дату в формате (пример формата: понедельник 20 марта 2023 время: 11.54.06 PM).
 На выходе дата должна быть класса String

 С количеством букв вам нужно будет разобраться, Посмотрев дополнительно класс:
 DateTimeFormatterBuilder (строки кода для ориентира в этом классе 1537,1661, 2051).
 Там описаны буквы учавствующие в паттернах для дат. */
public class Main {
    static void main() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d MMMM yyyy", java.util.Locale.forLanguageTag("ru"));
        String formattedDate1 = today.format(formatter1);
        System.out.println("1. " + today.getDayOfMonth()+ " "+ today.getMonth() + " " + today.getYear());
        System.out.println("1. " + formattedDate1);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy, hh:mm:ss a", java.util.Locale.forLanguageTag("ru"));
        String formattedDate = now.format(formatter);
        System.out.println("2. " + formattedDate);

        String dateString = "2023-03-19 : 10:12:24 AM";
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a", java.util.Locale.ENGLISH);
        LocalDateTime localDateTime = LocalDateTime.parse(dateString, formatter3);
        System.out.println("3. " + localDateTime);

        String dateString2 = "пн 20.03.23 г. время: 15:07:28";
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern(
                "EEE dd.MM.yy 'г.' 'время:' HH:mm:ss",
                new Locale("ru")
        );
        LocalDateTime localDateTime2 = LocalDateTime.parse(dateString2, formatter4);
        System.out.println("4. " + localDateTime2);

        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern(
                "EEEE dd MMMM yyyy 'время:' hh.mm.ss a",
                new Locale("ru")
        );
        String formattedDate3 = now.format(formatter5);
        System.out.println("5. " + formattedDate3);

      }
}
