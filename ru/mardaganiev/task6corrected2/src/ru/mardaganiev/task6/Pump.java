package ru.mardaganiev.task6;

import ru.mardaganiev.task6.drivepart.Engine;

//Насос "drive"- приводная часть насоса, "hydraulicpart"- гидравлическая часть насоса
public class Pump {
    public Drive drive;
    public HydraulicPart hydraulicPart;
    public final String SERIAL_NUMBER = "SDK1852";
    public final String DATE_OF_MANUFACTURE = "27.04.2019";
    protected String engine;
    protected String transmission;

    public void go() {
    }

    public int showWorkTime() {
        int WorkTime = 21;// время работы (наработка насоса)
        return WorkTime;
    }

    @Override
    public String toString() {
        return "Pump{" +
                "drive=" + drive +
                ", hydraulicPart=" + hydraulicPart +
                ", SERIAL_NUMBER='" + SERIAL_NUMBER + '\'' +
                ", DATE_OF_MANUFACTURE='" + DATE_OF_MANUFACTURE + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
