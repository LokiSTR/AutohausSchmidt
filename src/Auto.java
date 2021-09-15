public class Auto {
        
    String _marke;
    String _modell;
    int _preis;
    String _baujahr;

    public Auto(String marke, String modell, String baujahr){
        this.setMarke(marke);
        this.setModell(modell);
        this.setBaujahr(baujahr);
    }

    public String getMarke(){
        return _marke;
    }
    public String getModell(){
        return _modell;
    }
    public int getPreis(){
        return _preis;
    }
    public String getBaujahr(){
        return _baujahr;
    }

    public void setMarke(String marke){
        _marke = marke;
    }
    public void setModell(String modell){
        _modell = modell;
    }
    public void setPreis(int preis){
        _preis = preis;
    }
    public void setBaujahr(String baujahr){
        _baujahr  = baujahr;
    }
}