package com.research.webscraper.util;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class ISODate {
    private Instant instant;

    public ISODate(String isoString) {
        this.instant = Instant.parse(isoString);
    }

    public String getIsoString() {
        return DateTimeFormatter.ISO_INSTANT.format(instant);
    }

    public int getYear() {
        return instant.atZone(ZoneOffset.UTC).getYear();
    }

    public int getMonth() {
        return instant.atZone(ZoneOffset.UTC).getMonthValue();
    }

    public int getDay() {
        return instant.atZone(ZoneOffset.UTC).getDayOfMonth();
    }

    public int getHours() {
        return instant.atZone(ZoneOffset.UTC).getHour();
    }

    public int getMinutes() {
        return instant.atZone(ZoneOffset.UTC).getMinute();
    }

    public int getSeconds() {
        return instant.atZone(ZoneOffset.UTC).getSecond();
    }

    public int getMilliseconds() {
        return instant.atZone(ZoneOffset.UTC).getNano() / 1_000_000;
    }

    @Override
    public String toString() {
        return getIsoString();
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        String jsonTimestamp = "2024-07-09T10:52:43.643+00:00";
        ISODate myDate = new ISODate(jsonTimestamp);

        System.out.println(myDate); // 2024-07-09T10:52:33.396Z
        System.out.println("Year: " + myDate.getYear());
        System.out.println("Month: " + myDate.getMonth());
        System.out.println("Day: " + myDate.getDay());
    }
}