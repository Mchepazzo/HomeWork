package ru.mardaganiev.task6.drivepart;

import ru.mardaganiev.task6.Drive;

//трансмиссия привода насоса
public class Transmission extends Drive {
    String typeTransmission; //тип трансмиссии
    String nameTransmission; // наименование трансмиссии

    public Transmission(String typeTransmission, String nameTransmission) {
        this.typeTransmission = typeTransmission;
        this.nameTransmission = nameTransmission;
    }
}
