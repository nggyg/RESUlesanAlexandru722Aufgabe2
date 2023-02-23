public class Film {
    private String title;
    private String regiseur;
    private String genre;
    private double vreleihpreis;

    public Film(String title, String regiseur, String genre, double vreleihpreis) {
        this.title = title;
        this.regiseur = regiseur;
        this.genre = genre;
        this.vreleihpreis = vreleihpreis;
    }

    @Override
    public String toString() {
        return  "title='" + title + '\'' +
                ", regiseur='" + regiseur + '\'' +
                ", genre='" + genre + '\'' +
                ", vreleihpreis=" + vreleihpreis;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegiseur() {
        return regiseur;
    }

    public void setRegiseur(String regiseur) {
        this.regiseur = regiseur;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getVreleihpreis() {
        return vreleihpreis;
    }

    public void setVreleihpreis(double vreleihpreis) {
        this.vreleihpreis = vreleihpreis;
    }
}
