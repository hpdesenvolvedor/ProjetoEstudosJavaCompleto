package javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01{
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate date = LocalDate.of(2022, Month.AUGUST,6);
        LocalDate localdate2 = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.of(9,45,21);
        System.out.println(localDateTime);
        System.out.println(localdate2);
        LocalDateTime ldt = date.atTime(time);
        System.out.println(ldt);
    }
}
