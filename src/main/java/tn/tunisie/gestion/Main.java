
package tn.tunisie.gestion;

public class Main {

    public static void main(String[] args) {

        // Création de la société
        SocieteArrayList societe = new SocieteArrayList();

        // Création des employés
        Employe e1 = new Employe(3, "Ali", "Ahmed", "Informatique", 2);
        Employe e2 = new Employe(1, "Sami", "Mohamed", "Finance", 1);
        Employe e3 = new Employe(2, "Amine", "Karim", "Informatique", 1);
        Employe e4 = new Employe(4, "Youssef", "Ali", "Finance", 2);

        // 1. Ajouter les employés
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        // 2. Afficher les employés
        System.out.println("=== Liste des employés ===");
        societe.displayEmploye();

        // 3. Recherche par nom
        System.out.println("\n=== Recherche par nom ===");
        System.out.println(societe.rechercherEmploye("Ali"));

        // 4. Recherche par objet
        System.out.println("\n=== Recherche par objet ===");
        System.out.println(societe.rechercherEmploye(e1));

        // 5. Tri naturel par ID
        System.out.println("\n=== Tri par ID ===");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // 6. Tri personnalisé
        System.out.println("\n=== Tri par département, grade et nom ===");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        // 7. Recherche par département
        System.out.println("\n=== Recherche par département ===");
        System.out.println(
                societe.rechercherParDepartement("Informatique")
        );

        // 8. Suppression
        System.out.println("\n=== Suppression ===");
        societe.supprimerEmploye(e1);
        societe.displayEmploye();
    }
}
