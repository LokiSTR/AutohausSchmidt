public class App {

    static Auto[] _autos;
    static Kunde[] _kunden;
    static Verkaeufer[] _verkaeufer;
    static Verkauf[] _verkaeufe;

    public static void main(String[] args) throws Exception {
        //Initialisieren von _autos
        _autos = new Auto[8];
        _kunden = new Kunde[8];
        _verkaeufer = new Verkaeufer[8];
        _verkaeufe = new Verkauf[8];

        _autos[0] = new Auto("Ford", "Mustang", "1292");
        _autos[1] = new Auto("Toyota", "Supre", "1999");
        _autos[2] = new Auto("Volvo", "XC90", "1932");
        _autos[3] = new Auto("Prsche", "Panamera", "2012");
        _autos[4] = new Auto("Rolce Royce", "C", "2018");
        _kunden[0] = new Kunde("Heinrich", "Müller", "Turmstaße 12", "0129938481");
        _kunden[1] = new Kunde("Friedrich", "Willhelm", "Turmstraße 13", "10289013");
        _kunden[2] = new Kunde("Dietmar", "Köppke", "Turmstraße 14", "109280314");
        _kunden[3] = new Kunde("Samba", "Honolulu", "Turmstraße 15", "90128081");
        _verkaeufer[0] = new Verkaeufer("Reiner", "Schmidt", 1313);
        _verkaeufer[1] = new Verkaeufer("Heinrich", "Hubert", 1973);



        //Wechsel in der Konsole wieder zum Startmenü
        Menu menu = new Menu();
        menu.startMenu();

    }


    //Eine generelle Methode, dam   it man nicht drei mal das gleiche dort stehen hat. In den zeilen danach wird es immerr für auto, kunde, verkäufer eingesetzt
    public static void addObject(Object ele, Object[] array){
        int i = 0;
        for (Object a : array){
            //wenn die stelle im array null ist kann man dort ein neues objekt erstellen
            if(a == null){
                array[i] = ele;
                //damit man nicht ein objekt 8 mal erzeugt
                break;
            }
            //wird erhöht
            i++;
        }
    }
    





    public static void addAuto(Auto auto){
        addObject(auto, getAllAutos());
    }
    public static void addKunde(Kunde kunde){
        addObject(kunde, getAllKundes());
    }
    public static void addVerkaeufer(Verkaeufer verkaeufer){
        addObject(verkaeufer, getAllVerkaeufers());
    }

    //ermöglicht array
    public static Auto[] getAllAutos(){
        return _autos;
    }
    public static Kunde[] getAllKundes(){
        return _kunden;
    }
    public static Verkaeufer[] getAllVerkaeufers(){
        return _verkaeufer;
    }

}