package com.company;

import java.util.Date;

/**
 *
 * @author hugoh
 */
public class Bedrijf extends Klant{
    private String bedrijfsnaam;
    private int KVK;
    private String Adres;

    public Bedrijf(int accountId, String naam, Date geboortedatum, String woonplaats, String wachtwoord, String telefoonnummer, String emailAdres, int totaalBestellingen, String soortKlant, String bedrijfsnaam, int KVK, String adres, int telefoonnummerBedrijf) {
        super(accountId, naam, geboortedatum, woonplaats, wachtwoord, telefoonnummer, emailAdres, totaalBestellingen, soortKlant);
        this.bedrijfsnaam = bedrijfsnaam;
        this.KVK = KVK;
        Adres = adres;
        TelefoonnummerBedrijf = telefoonnummerBedrijf;
    }

    //Getters + Setters

    public String getBedrijfsnaam() {
        return bedrijfsnaam;
    }

    public void setBedrijfsnaam(String bedrijfsnaam) {
        this.bedrijfsnaam = bedrijfsnaam;
    }

    public int getKVK() {
        return KVK;
    }

    public void setKVK(int KVK) {
        this.KVK = KVK;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String adres) {
        Adres = adres;
    }

    public int getTelefoonnummerBedrijf() {
        return TelefoonnummerBedrijf;
    }

    public void setTelefoonnummerBedrijf(int telefoonnummerBedrijf) {
        TelefoonnummerBedrijf = telefoonnummerBedrijf;
    }

    private int TelefoonnummerBedrijf;

}
