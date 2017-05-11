package com.company;

import java.util.Date;

/**
 * Created by User on 9-5-2017.
 */
public class Klant extends Account {
    private int totaalBestellingen;
    private String soortKlant;

    public Klant(int accountId, String naam, Date geboortedatum, String woonplaats, String wachtwoord, String telefoonnummer, String emailAdres, int totaalBestellingen, String soortKlant) {
        super(accountId, naam, geboortedatum, woonplaats, wachtwoord, telefoonnummer, emailAdres);
        this.totaalBestellingen = totaalBestellingen;
        this.soortKlant = soortKlant;
    }

    //Getters + Setters
    public int getTotaalBestellingen() {
        return totaalBestellingen;
    }

    public void setTotaalBestellingen(int totaalBestellingen) {
        this.totaalBestellingen = totaalBestellingen;
    }

    public String getSoortKlant() {
        return soortKlant;
    }

    public void setSoortKlant(String soortKlant) {
        this.soortKlant = soortKlant;
    }
}
