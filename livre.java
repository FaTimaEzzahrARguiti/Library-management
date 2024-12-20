package librerie;

public class livre{
    public  String nom;
    public String auteur;
    public  String ISBN;
    public  boolean dispo;

    public livre(String nom, String auteur, String ISBN, boolean dispo) {
        this.nom=nom;
        this.auteur=auteur;
        this.ISBN=ISBN;
        this.dispo=dispo;
    }
public livre(){

}
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    @Override
    public String toString() {
        return "livre{" +
                "nom='" + nom + '\'' +
                ", auteur='" + auteur + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", dispo=" + dispo +
                '}';
    }
}