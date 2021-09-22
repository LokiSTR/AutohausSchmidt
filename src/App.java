public class App {

    static Auto[] _autos;

    public static void main(String[] args) throws Exception {
        //Initialisieren von _autos
        _autos = new Auto[8];

        _autos[0] = new Auto("Ford", "Mustang", "1292");
        _autos[1] = new Auto("Toyota", "Supre", "1999");
        _autos[2] = new Auto("Volvo", "XC90", "1932");
        _autos[3] = new Auto("Prsche", "Panamera", "2012");
        _autos[4] = new Auto("Rolce Royce", "C", "2018");


        //Wechsel in der Konsole wieder zum Startmenü
        Menu menu = new Menu();
        menu.startMenu();

    }

    public static void addAuto(Auto auto){
        _autos[0] = auto;
    }

    public static Auto[] getAllAutos(){
        return _autos;
    }
}