package hu.nive.ujratervezes.zarovizsga.workhours;

import java.time.LocalDate;

public class Employee {

    private final String name;
    private final LocalDate date;
    private final int hours;

    public Employee(String name, int hours, LocalDate date) {

        this.name = name;
        this.date = date;
        this.hours = hours;

    }

    public String getName() {
        return name;

    }

    public LocalDate getDate() {
        return date;

    }

    public int getHours() {
        return hours;

    }
}