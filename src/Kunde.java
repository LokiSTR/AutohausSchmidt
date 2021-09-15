public class Kunde {
    
    String _vorname;
    String _nachname;
    String _adresse;
    String _telefon;


    public Kunde(String vorname, String nachname,String adresse, String telefon){
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setAdresse(adresse);
        this.setTelefon(telefon);
    }


    public String getVorname(){
        return _vorname;
    }
    public String getNachname() {
        return _nachname;
    }
    public String getAdresse() {
        return _adresse;
    }
    public String getTelefon() {
        return _telefon;
    }

    public void setVorname(String vorname) {
        this._vorname = vorname;
    }
    public void setNachname(String nachname) {
        this._nachname = nachname;
    }
    public void setAdresse(String adresse) {
        this._adresse = adresse;
    }
    public void setTelefon(String telefon) {
        this._telefon = telefon;
    }
    
}
