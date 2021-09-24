import java.util.Scanner;

public class Menu {
    
    public Scanner _Scanner;
    
    public Menu(){
        set_Scanner(new Scanner(System.in));
        startMenu();
        createAutos();
        createKunde();
        createVerkaeufer();
    }
    void startMenu(){
        System.out.println("Bitte wähle aus");
        System.out.println("1 Neuer Verkauf");
        System.out.println("2 Neuer Kunde");
        System.out.println("3 Neuer Auto");
        System.out.println("4 Neuer Verkäufer");
        System.out.println("5 Neues Auto");
        System.out.println("6 Autoliste abrufen");
               
        String choice = get_Scanner().nextLine();
        
        System.out.println("Deine Wahl ist: " + choice);
    
        if(choice.equals("1")){
            createVerkaeufeMenu();
        }
        else if(choice.equals("2")){
            createKunde();
        }
        else if(choice.equals("3")){
            createAutos();
        }
        else if(choice.equals("4")){
            createVerkaeufer();
        }
        else if(choice.equals("5")){
            createAutoMenu();
        }
        else if(choice.equals("6")){
            showAutos();
        }
        else {
            System.out.println("Bitte nur 1, 2, 3, 4, 5 oder 6 eingeben");
        }
        startMenu();
        
    }

    public void createVerkaeufeMenu(){
        int i = 0;
        System.out.println("Bitte wählen Sie ein Auto aus: ");
        for(Auto auto : App.getAllAutos()){
            if(auto != null){
                System.out.println(i + " - " + auto.getMarke() + " " + auto.getModell());
                i++;
            }
        }
        String car_choice = get_Scanner().next();
        int car_index = Integer.valueOf(car_choice);

        System.out.println(App.getAllAutos()[car_index]);
    }


    public void createAutos(){
        System.out.println("Marke");
        String choicemarke = get_Scanner().nextLine();
        System.out.println("Modell");
        String choicemodell = get_Scanner().nextLine();
        System.out.println("Baujahr");
        String choicebaujahr = get_Scanner().nextLine(); 
        
        Auto a1 = new Auto(choicemarke, choicemodell, choicebaujahr);
        //ARRAY BEISPIEL plus minus von trampe
        //Auto[] autos = new Auto[8]; das ist dann [1, 2, 3, 4, 5, 6, 7, 8]
        // die 1 würde dann beispielsweise auf ein auto a1 zeigen, wenn man das so eingibt
        //mit integer wäre int[]

        System.out.println(a1);
    }   

    public void createKunde(){
        System.out.println("Bitte Daten des Kunden eingeben: ");
        System.out.println("Vorname: ");
        String choicevorname = get_Scanner().nextLine();
        System.out.println("Nachname");
        String choicenachname = get_Scanner().nextLine();
        System.out.println("Adresse");
        String choiceadresse = get_Scanner().nextLine();
        System.out.println("Telefon");
        String createtelefon = get_Scanner().nextLine();

        Kunde k = new Kunde(choicevorname, choicenachname, choiceadresse, createtelefon);

        startMenu();
        System.out.println("Der neue Kunde heißt " + k.getVorname() + " " + k.getNachname());
    }

    public void createVerkaeufer(){
        System.out.println("Vorname");
        String choicevornamevk = get_Scanner().nextLine();
        System.out.println("Nachname");
        String choicenachnamevk = get_Scanner().nextLine();
        System.out.println("Pers Nummer");
        int choicepersnummer = get_Scanner().nextInt();

        Verkaeufer vk1 = new Verkaeufer(choicevornamevk, choicenachnamevk, choicepersnummer);
    
        System.out.println(vk1);
    }


    public void set_Scanner(Scanner _Scanner) {
        this._Scanner = _Scanner;
    }
    public Scanner get_Scanner() {
        return _Scanner;
    }
    
    public void showAutos(){
        //foreach schleife
        for(Auto auto : App.getAllAutos()){
            //wenn dieses auto nicht null ist geben wird die marke aus
            if(auto != null){
                System.out.println(auto.getMarke());
            }
        }
    }

    public void createAutoMenu(){
        System.out.println("Create new Auto");
        //man ruft einfach immer wieder den scanner auf
        System.out.print("Marke: ");
        String marke = get_Scanner().nextLine();
        System.out.print("Modell: ");
        String modell = get_Scanner().nextLine();
        System.out.print("Baujahr: ");
        String baujahr = get_Scanner().nextLine();

        //etstelltes auto mit den strings aus app.java
        App.addAuto(new Auto(marke, modell, baujahr));
    
        System.out.println(App.getAllAutos());

        // nach ende der erstellung des autos soll einfach wieder an den anfang gesprungen werden

        startMenu();
    
    }
}