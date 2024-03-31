package javacore.Rdatas.test;

import java.io.OutputStream;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(1990, 11, 28);
        LocalDate agora = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getMonth());
        System.out.println(date.isLeapYear()); //saber se é um ano bisiestos
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(agora);
    }
}
