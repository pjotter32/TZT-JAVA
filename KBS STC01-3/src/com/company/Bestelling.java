package com.company;

/**
 * Created by User on 9-5-2017.
 */
public class Bestelling {
    private int klantId;
    private int maatDoos;
    private String beginLocatie;
    private String eindLocatie;
    private int puntenWaarde;
    private int waardeBestelling;

    public Bestelling(int klantId, int maatDoos, String beginLocatie, String eindLocatie, int puntenWaarde, int waardeBestelling) {
        this.klantId = klantId;
        this.maatDoos = maatDoos;
        this.beginLocatie = beginLocatie;
        this.eindLocatie = eindLocatie;
        this.puntenWaarde = puntenWaarde;
        this.waardeBestelling = waardeBestelling;
    }

    //Getters + Setters
    public int getKlantId() {
        return klantId;
    }

    public void setKlantId(int klantId) {
        this.klantId = klantId;
    }

    public int getMaatDoos() {
        return maatDoos;
    }

    public void setMaatDoos(int maatDoos) {
        this.maatDoos = maatDoos;
    }

    public String getBeginLocatie() {
        return beginLocatie;
    }

    public void setBeginLocatie(String beginLocatie) {
        this.beginLocatie = beginLocatie;
    }

    public String getEindLocatie() {
        return eindLocatie;
    }

    public void setEindLocatie(String eindLocatie) {
        this.eindLocatie = eindLocatie;
    }

    public int getPuntenWaarde() {
        return puntenWaarde;
    }

    public void setPuntenWaarde(int puntenWaarde) {
        this.puntenWaarde = puntenWaarde;
    }

    public int getWaardeBestelling() {
        return waardeBestelling;
    }

    public void setWaardeBestelling(int waardeBestelling) {
        this.waardeBestelling = waardeBestelling;
    }
}
