package librerie;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<livre> books = new ArrayList<>();

    public static void addBook() {
        livre newlivre = new livre();  // Create a new book object

        System.out.println("Titre:");
        newlivre.nom = scanner.nextLine();  // Read the title

        System.out.println("Auteur:");
        newlivre.auteur = scanner.nextLine();  // Read the author

        System.out.println("ISBN:");
        newlivre.ISBN = scanner.nextLine();  // Read the ISBN

        System.out.println("Disponibilité (true/false):");
        while (!scanner.hasNextBoolean()) {
            System.out.println("Veuillez entrer true ou false.");
            scanner.next();  // Consume invalid input
        }
        newlivre.dispo = scanner.nextBoolean();  // Read the availability status
        scanner.nextLine();  // Consume the leftover newline character

        // Add the new book to the books list
        books.add(newlivre);

        System.out.println("Le livre a été ajouté avec succès!");
    }

    public static void removeBook() {
        System.out.println("Entrez le titre de livre");
        String titre = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (titre.equals(books.get(i).nom)) {
                books.remove(i);  // Remove the book
                System.out.println("Le livre a été supprimé avec succès !");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Livre non trouvé");
        }
    }

    public static void afficherBook() {
        if (books.isEmpty()) {  // Check if the list is empty
            System.out.println("La liste des livres est vide");
        } else {
            for (livre book : books) {
                System.out.println("Titre: " + book.nom);
                System.out.println("Auteur: " + book.auteur);
                System.out.println("ISBN: " + book.ISBN);
                System.out.println("Disponibilité: " + book.dispo);
                System.out.println("-------------------------------");
            }
        }
    }

    public static void modifierBook() {
        String titre;
        boolean found = false;
        System.out.println("Entrer le titre du livre à modifier");
        titre = scanner.nextLine();
        for (livre book : books) {
            if (book.nom.equals(titre)) {
                found = true;
                System.out.println("Entrer le nouveau titre:");
                book.setNom(scanner.nextLine());
                System.out.println("Entrer le nouveau auteur:");
                book.setAuteur(scanner.nextLine());
                System.out.println("Entrer le nouveau ISBN:");
                book.setISBN(scanner.nextLine());
                System.out.println("Entrer la nouvelle disponibilité :");
                book.setDispo(scanner.nextBoolean());
                System.out.println("Le livre a été modifié avec succès !");
                break;
            }
        }
        if (!found) {
            System.out.println("Livre non trouvé");
        }
    }

    public static void rechercherLivre() {
        System.out.println("Entrez le titre du livre");
        String titre = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (titre.equals(books.get(i).nom)) {
                System.out.println("Titre: " + books.get(i).nom);
                System.out.println("Auteur: " + books.get(i).auteur);
                System.out.println("ISBN: " + books.get(i).ISBN);
                System.out.println("Disponibilité: " + books.get(i).dispo);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Livre non trouvé");
        }
    }

    public static void main(String[] args) {
        int choix;
        System.out.println("-_-_-_-_-_-_-MENU-_-_-_-_-_-_-_-_-");
        System.out.println("1- Ajouter livres ");
        System.out.println("2- Afficher livre  ");
        System.out.println("3- Supprimer livres ");
        System.out.println("4- Modifier un livre  ");
        System.out.println("5- Rechercher les livres ");
        System.out.println("6- Quitter");
        System.out.println("Choisir une option");
        choix = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline character

        do {
            switch (choix) {
                case 1:
                    addBook();
                    break;
                case 2:
                    afficherBook();
                    break;
                case 3:
                    removeBook();
                    break;
                case 4:
                    modifierBook();
                    break;
                case 5:
                    rechercherLivre();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide");
            }
            System.out.println("Choisir une option");
            choix = scanner.nextInt();
            scanner.nextLine();  // Consume the leftover newline character
        } while (choix != 6);
    }
}
