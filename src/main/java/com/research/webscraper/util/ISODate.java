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
}