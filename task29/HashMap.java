package ru.mardaganiev.task29;

import java.util.Map;
import java.lang.String;

public class HashMap {
    public static Map<String, Person> createMap() {
        Map<String, Person> book = new java.util.HashMap<>();
        Person person1 = new Person(29, "Петрова", "");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person1);
        book.put("Key4", person1);
        book.put("Key5", person1);
        book.put("Key6", person1);
        return book;
    }

    public static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

}
