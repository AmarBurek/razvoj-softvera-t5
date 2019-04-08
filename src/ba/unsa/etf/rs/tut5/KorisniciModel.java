package ba.unsa.etf.rs.tut5;

import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList KorisniciModel;
    private SimpleObjectProperty <korisnik> TrenutniKorisnik


    public KorisniciModel(ObservableList korisniciModel, SimpleObjectProperty<korisnik> trenutniKorisnik) {
        KorisniciModel = korisniciModel;
        TrenutniKorisnik = trenutniKorisnik;
    }

    public void setKorisniciModel(ObservableList korisniciModel) {
        KorisniciModel = korisniciModel;
    }

    public void setTrenutniKorisnik(SimpleObjectProperty<korisnik> trenutniKorisnik) {
        TrenutniKorisnik = trenutniKorisnik;
    }

    public ObservableList getKorisniciModel() {
        return KorisniciModel;
    }

    public SimpleObjectProperty<korisnik> getTrenutniKorisnik() {
        return TrenutniKorisnik;
    }
}
