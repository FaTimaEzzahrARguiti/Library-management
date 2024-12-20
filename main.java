
package librerie;
import java.util.Scanner;
import java.util.ArrayList;
public class main{
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<livre> books = new ArrayList<>();
public static void addBook(){
    livre newlivre= new livre();  //Object

    System.out.println("Titre:");
    newlivre.nom=scanner.nextLine();
    System.out.println("auteur:");
    newlivre.auteur=scanner.nextLine();
    System.out.println("ISBN");
    newlivre.ISBN=scanner.nextLine();
    System.out.println("dispo");
    newlivre.dispo=scanner.nextBoolean();
    books.add(newlivre);
}

public static void removeBook(){
    System.out.println("Entrez le titre de livre");
    String titre =scanner.nextLine();
    livre newlivre= new livre();
    for(int i=0;i<books.size();i++){
        if(titre==books.get(i).nom){

        }books.remove(books.get(i));
    }
}

        public static void main(String[] args){
            System.out.println("-_-_-_-_-_-_-MENU-_-_-_-_-_-_-_-_-");
            System.out.println("1- Afficher livres ");
            System.out.println("2- Ajouter livre  ");
            System.out.println("3- Supprimer livres ");
            System.out.println("4- Modifier un livre  ");
            System.out.println("5- Afficher les livres ");
        }
}