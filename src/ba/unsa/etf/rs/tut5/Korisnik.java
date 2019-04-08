package ba.unsa.etf.rs.tut5;

import javafx.beans.property.SimpleStringProperty;

public class Korisnik {

    private SimpleStringProperty Ime, Prezime, Email, lozinka, KorisnickoIme;

    public Korisnik(SimpleStringProperty ime, SimpleStringProperty prezime, SimpleStringProperty email, SimpleStringProperty lozinka, SimpleStringProperty korisnickoIme) {
        Ime = ime;
        Prezime = prezime;
        Email = email;
        this.lozinka = lozinka;
        KorisnickoIme = korisnickoIme;
    }

    public String Korisnik(){

    }

    public String getPrezime() {
        return Prezime.get();
    }

    public SimpleStringProperty prezimeProperty() {
        return Prezime;
    }

    public void setPrezime(String prezime) {
        this.Prezime.set(prezime);
    }

    public String getIme() {
        return Ime.get();
    }

    public SimpleStringProperty imeProperty() {
        return Ime;
    }

    public void setIme(String ime) {
        this.Ime.set(ime);
    }

    public String getEmail() {
        return Email.get();
    }

    public SimpleStringProperty emailProperty() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email.set(email);
    }

    public String getLozinka() {
        return lozinka.get();
    }

    public SimpleStringProperty lozinkaProperty() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka.set(lozinka);
    }

    public String getKorisnickoIme() {
        return KorisnickoIme.get();
    }

    public SimpleStringProperty korisnickoImeProperty() {
        return KorisnickoIme;
    }
}
