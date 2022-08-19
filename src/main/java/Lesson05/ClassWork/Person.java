package Lesson05.ClassWork;

import java.time.LocalDate;

public abstract class Person {
    private static int count;
    private final String name;
    private final String surName;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public LocalDate getbDate() {
        return bDate;
    }

    public int getId() {
        return id;
    }

    private final LocalDate bDate;
    private final int id;

    public Person(String name, String surName, LocalDate bDate) {
        this.name = name;
        this.surName = surName;
        this.bDate = bDate;
        this.id = ++count;
    }
}
