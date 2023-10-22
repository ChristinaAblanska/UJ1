package week_1.Input_Output;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Lecture_Task_4_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDate dayToday = LocalDate.of(2023, 10, 22);
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(dayToday));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(dayToday));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(dayToday));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(dayToday));

        LocalDate anotherSummerDay = LocalDate.of(2023, 10, 22);
        LocalTime anotherTime = LocalTime.of(13, 12, 45);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(anotherSummerDay, anotherTime, ZoneId.of("Europe/Helsinki"));
        System.out.println(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)
                        .format(zonedDateTime));
        System.out.println(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
                        .format(zonedDateTime));
        System.out.println(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                        .format(zonedDateTime));
        System.out.println(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                        .format(zonedDateTime));

        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.of(2023, 10, 22)));
        System.out.println(DateTimeFormatter.ISO_OFFSET_DATE.format(LocalDate.of(2023, 10, 22).atStartOfDay(ZoneId.of("UTC-3"))));
        System.out.println(DateTimeFormatter.RFC_1123_DATE_TIME.format(LocalDate.of(2023, 10, 22).atStartOfDay(ZoneId.of("UTC-3"))));
        System.out.println(LocalDate.from(DateTimeFormatter.ISO_LOCAL_DATE.parse("2023-10-22")).plusDays(3));
    }
}
