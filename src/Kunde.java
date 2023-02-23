import java.util.ArrayList;
import java.util.List;

public class Kunde {
    private int id;
    private String name;
    private List<Film> filme;

    public Kunde(int id, String name, List<Film> filme) {
        this.id = id;
        this.name = name;
        this.filme = filme;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", filme=" + filme;
    }

    public Kunde(int id, String name) {
        this.id = id;
        this.name = name;
        this.filme=new ArrayList<Film>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Film> getFilme() {
        return filme;
    }

    public void setFilme(List<Film> filme) {
        this.filme = filme;
    }
}
