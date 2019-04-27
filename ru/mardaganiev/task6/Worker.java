package ru.mardaganiev.task6;

import ru.mardaganiev.Person;

import java.time.LocalDate;

public class Worker extends Person {

    public Worker(String firstName, String lastName, LocalDate birthday, int personnelNumber) {
        super(firstName, lastName, birthday);
        this.personnelNumber = personnelNumber;
    }

    private int personnelNumber;

    public Worker(String родион, String бесчастных, LocalDate now) {
        super(родион, бесчастных, now);
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(int personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "personnelNumber=" + personnelNumber +
                '}';
    }
}
