package joda;

import java.time.*;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);

    }
}
