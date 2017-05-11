package com.company;

import java.util.Date;

/**
 * Created by User on 9-5-2017.
 */
public class Koerier extends Account{
    private int puntensaldo;
    private int totaalGeleverd;
    private int rating;

    public Koerier(int accountId, String naam, Date geboortedatum, String woonplaats, String wachtwoord, String telefoonnummer, String emailAdres, int puntensaldo, int totaalGeleverd, int rating) {
        super(accountId, naam, geboortedatum, woonplaats, wachtwoord, telefoonnummer, emailAdres);
        this.puntensaldo = puntensaldo;
        this.totaalGeleverd = totaalGeleverd;
        this.rating = rating;
    }

    //Getters + Setters
    public int getPuntensaldo() {
        return puntensaldo;
    }

    public void setPuntensaldo(int puntensaldo) {
        this.puntensaldo = puntensaldo;
    }

    public int getTotaalGeleverd() {
        return totaalGeleverd;
    }

    public void setTotaalGeleverd(int totaalGeleverd) {
        this.totaalGeleverd = totaalGeleverd;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
