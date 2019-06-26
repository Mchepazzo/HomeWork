package ru.mardaganiev.task29;

import java.util.Objects;
import java.lang.String;


public class Person {
    private int age;
    private String firstName;
    private String sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                firstName.equals(person.firstName) &&
                sex.equals(person.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, sex);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Person(int age, String firstName, String sex) {
        this.age = age;
        this.firstName = firstName;
        this.sex = sex;
    }
}
