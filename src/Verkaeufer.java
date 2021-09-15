public class Verkaeufer {
    
    String _vorname;
    String _nachname;
    int _personalnummer;

    public Verkaeufer(String vorname, String nachname, int personalnummer){
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setPersonalnummer(personalnummer);
    }

    public String getVorname(){
        return _vorname;
    }
    public String getNachname(){
        return _nachname;
    }
    public int getPersonalnummer(){
        return _personalnummer;
    }

    public void setVorname(String vorname){
        _vorname = vorname;
    }
    public void setNachname(String nachname){
        _nachname = nachname;
    }
    public void setPersonalnummer(int personalnummer){
        _personalnummer = personalnummer;
    }
}

