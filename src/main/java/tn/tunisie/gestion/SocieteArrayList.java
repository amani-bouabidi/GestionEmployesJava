
package tn.tunisie.gestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {

    ArrayList<Employe> employes = new ArrayList<>();

    // Ajouter un employé
    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    // Rechercher par nom
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    // Rechercher par objet
    @Override
    public boolean rechercherEmploye(Employe e) {
        for (Employe emp : employes) {
            if (emp.getId() == e.getId()) {
                return true;
            }
        }
        return false;
    }

    // Supprimer un employé
    @Override
    public void supprimerEmploye(Employe e) {
        employes.removeIf(emp -> emp.getId() == e.getId());
    }

    // Afficher les employés
    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    // Tri naturel par ID
    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    // Tri personnalisé
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> c =
                Comparator.comparing(Employe::getNomDepartement)
                        .thenComparingInt(Employe::getGrade)
                        .thenComparing(Employe::getNom);

        Collections.sort(employes, c);
    }

    @Override
    public ArrayList<Employe> rechercherParDepartement(String nomDepartement) {

        ArrayList<Employe> resultat = new ArrayList<>();

        for (Employe e : employes) {
            if (e.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                resultat.add(e);
            }
        }

        return resultat;
    }
}
