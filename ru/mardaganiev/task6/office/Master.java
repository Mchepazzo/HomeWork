package ru.mardaganiev.task6.office;

import ru.mardaganiev.Person;

import java.time.LocalDate;

public class Master extends Person {
    private int salary;

    public Master(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }
}
