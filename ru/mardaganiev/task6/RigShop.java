package ru.mardaganiev.task6;

import java.util.Arrays;

public class RigShop {
    private String  title;
    private Worker[] workers = new Worker [10];

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "RigShop{" +
                "title='" + title + '\'' +
                ", workers=" + Arrays.toString(workers) +
                '}';
    }
}
