package cn.stonemind.base.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest {

    public static void main(String[] args) {
        LocalDateTime currDateTime = LocalDateTime.now();
        System.out.println("currDateTime: " + currDateTime);
        LocalDateTime maxDayTime = LocalDateTime.MAX;
        LocalDateTime minDayTime = LocalDateTime.MIN;
        System.out.println("MaxDayTime: " + maxDayTime);
        System.out.println("MinDayTime: " + minDayTime);

        LocalTime maxTime = LocalTime.MAX;
        LocalTime minTime = LocalTime.MIN;
        System.out.println("maxTime: " + maxTime);
        System.out.println("minTime: " + minTime);

        LocalDate currDate = LocalDate.now();
        System.out.println("currDate: " + currDate);

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("tomorrow: " + tomorrow);

        LocalDateTime tomorrowDateTime = LocalDateTime.of(tomorrow, LocalTime.MIN);
        LocalDateTime now = LocalDateTime.now();
        Long betweenSecond = ChronoUnit.SECONDS.between(now, tomorrowDateTime);

        System.out.println("betweenSecond: " + betweenSecond);
        System.out.println("betweenMinutes: " + betweenSecond / 60);
        System.out.println("betweenHours: " + betweenSecond / 60 / 60);

    }
}
