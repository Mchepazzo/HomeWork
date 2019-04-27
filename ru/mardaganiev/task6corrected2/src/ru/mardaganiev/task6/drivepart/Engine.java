package ru.mardaganiev.task6.drivepart;

import ru.mardaganiev.task6.Drive;

// двигатель привода насоса
public class Engine extends Drive {
    String typeEngine; //тип двигателя
    String nameEngine; // наименование двигателя

    public Engine(String typeEngine, String nameEngine) {
        this.typeEngine = typeEngine;
        this.nameEngine = nameEngine;
    }

    public Engine() {

    }
}
