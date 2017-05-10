package com.company;

import java.util.Date;

/**
 * Created by User on 9-5-2017.
 */
public class Account {
    private int accountId;
    private String naam;
    private Date geboortedatum;
    private String woonplaats;
    private String wachtwoord;
    private String telefoonnummer;
    private String emailAdres;

    public Account(int accountId, String naam, Date geboortedatum, String woonplaats, String wachtwoord, String telefoonnummer, String emailAdres) {
        this.accountId = accountId;
        this.naam = naam;
        this.geboortedatum = geboortedatum;
        this.woonplaats = woonplaats;
        this.wachtwoord = wachtwoord;
        this.telefoonnummer = telefoonnummer;
        this.emailAdres = emailAdres;
    }

    //Getters + Setters

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public String getEmailAdres() {
        return emailAdres;
    }

    public void setEmailAdres(String emailAdres) {
        this.emailAdres = emailAdres;
    }
}
