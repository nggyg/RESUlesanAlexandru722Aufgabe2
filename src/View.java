import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class View {


    public static void main(String[] args) {
        Controller controller=new Controller(defaultfillFilm(),defaultFillKunde());
        controller.filterByGenre("Action");
        controller.findClientsByRegisour("Joe Russo");
    }
    public static void filterByGebre(String genre){

    }
    private static List<Film> defaultfillFilm() {
        List<Film> inventory=new ArrayList<Film>();
        inventory.add(new Film("Titanic","James Cameron","Romance",30));
        inventory.add(new Film("Avengers Endgame","Anthony Russo","Action",60));
        inventory.add(new Film("Grown Ups","Adam Sandler","Comedy",25));
        inventory.add(new Film("Avengers Infinty War","Joe Russo","Action",55));
        return inventory;
    }
    public static List<Kunde> defaultFillKunde(){
        List<Kunde> clients=new ArrayList<Kunde>();
        clients.add(new Kunde(1,"Mark Greyson",new ArrayList<Film>()));
        clients.add(new Kunde(2,"Clark Greyson",new ArrayList<Film>()));
        clients.add(new Kunde(3,"Bark Greyson",new ArrayList<Film>()));
        return clients;
    }
}