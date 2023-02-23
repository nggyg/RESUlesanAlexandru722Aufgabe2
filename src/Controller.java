import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Controller {
    private List<Film> inventory;
    private List<Kunde> clientel;

    public Controller(List<Film> inventory, List<Kunde> clientel) {
        this.inventory = inventory;
        this.clientel = clientel;
    }

    public Controller() {
        this.clientel=new ArrayList<Kunde>();
        this.inventory=new ArrayList<Film>();
    }

    public List<Film> getInventory() {
        return inventory;
    }

    public void setInventory(List<Film> inventory) {
        this.inventory = inventory;
    }

    public List<Kunde> getClientel() {
        return clientel;
    }

    public void setClientel(List<Kunde> clientel) {
        this.clientel = clientel;
    }
    public void addFilm(Film film){
        this.inventory.add(film);
    }
    public void removeFilm (Film film){
        this.inventory.remove(film);
    }
    public void addCostumer(Kunde kunde){
        this.clientel.add(kunde);
    }
    public void removeCostumer(Kunde kunde){
        this.clientel.remove(kunde);
    }
    public void filterByGenre(String genre){
        this.inventory.stream().filter(film -> Objects.equals(film.getGenre(), genre)).forEach(System.out::println);
    }
    public void findClientsByRegisour(String reg){
        this.clientel.stream().filter(client-> client.getFilme().stream().anyMatch(film -> Objects.equals(film.getRegiseur(), reg))).forEach(System.out::println);
    }
    public void sortClientsFilms(Kunde kunde,boolean asc){
        if(asc)
            kunde.getFilme().stream().sorted((f1,f2)->f1.getRegiseur().compareTo(f2.getRegiseur())).forEach(System.out::println);
        kunde.getFilme().stream().sorted((f2,f1)->f1.getRegiseur().compareTo(f2.getRegiseur())).forEach(System.out::println);
    }
}
