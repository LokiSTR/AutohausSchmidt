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
        
        String choice = get_Scanner().nextLine();
        
    
        if(choice.equals("1")){
            System.out.print("Neuer Verkauf noch nicht da");
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
        else {
            System.out.println("Bitte nur 1, 2, 3 oder 4 eingeben");
        }
    
    
    }

    public void createAutos(){
        System.out.println("Create Car");
        System.out.println("Marke");
        String choicemarke = get_Scanner().nextLine();
        System.out.println("Modell");
        String choicemodell = get_Scanner().nextLine();
        System.out.println("Baujahr");
        String choicebaujahr = get_Scanner().nextLine(); 
        
        Auto a1 = new Auto(choicemarke, choicemodell, choicebaujahr);

        System.out.println(a1);
    }   

    public void createKunde(){
        System.out.println("Create Käufer");
        System.out.println("Vorname");
        String choicevorname = get_Scanner().nextLine();
        System.out.println("Nachname");
        String choicenachname = get_Scanner().nextLine();
        System.out.println("Adresse");
        String choiceadresse = get_Scanner().nextLine();
        System.out.println("Telefon");
        String createtelefon = get_Scanner().nextLine();

        Kunde k1 = new Kunde(choicevorname, choicenachname, choiceadresse,createtelefon);

        System.out.println(k1);
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

    
}