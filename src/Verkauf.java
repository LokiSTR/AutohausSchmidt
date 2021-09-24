public class Verkauf {
    Auto _auto;
    Kunde _kunde;
    int _preis;
    Verkaeufer _verkaeufer;
    

    
    public Verkauf(Auto auto, Verkaeufer verkaeufer, Kunde kunde){
        this.setAuto(auto);
        this.setVerkaeufer(verkaeufer);
        this.setKunde(kunde);
    }

    public Auto getAuto() {
        return _auto;
    }
    public Kunde getKunde() {
        return _kunde;
    }
    public int getPreis() {
        return _preis;
    }
    //Methodensignatur 4 Teile. public = sichtbarkeitsbereich, hier überall. Verkaeufer = Dienstleistungsmethode oder rückgabemethode,
    // hier dann der wert verkaeufer, Rückgabemethode muss return haben. getVerkaeufer = Methodenname. return gibt den Wert
    // der variablen zurück. In die () kommen die Parameter, also Variable mit datentyp, die der Methode übergeben werden.
    public Verkaeufer getVerkaeufer() {
        //Methodenrumpf, alles, was innerhalb von {} steht
        return _verkaeufer;
    }

//this._auto zeigt, dass das die Variable ist und man hätte den anderen kram auch als _auto beibehalten können.
    public void setAuto(Auto auto) {
        this._auto = auto;
    }
    public void setKunde(Kunde kunde) {
        this._kunde = kunde;
    }
    public void setPreis(int preis) {
        this._preis = preis;
    }
    public void setVerkaeufer(Verkaeufer verkaeufer) {
        this._verkaeufer = verkaeufer;
    }
}
