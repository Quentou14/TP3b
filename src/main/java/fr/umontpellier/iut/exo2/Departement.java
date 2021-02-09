package fr.umontpellier.iut.exo2;

import fr.umontpellier.iut.exo1.Etudiants;

import java.util.ArrayList;

public class Departement {
    private ArrayList<fr.umontpellier.iut.exo1.Etudiants> tableau;
    private String specialite;
    private String adresse;

    public Departement(String s, String a) {
        this.specialite = s;
        this.adresse = a;
        this.tableau = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Liste etudiant:" + this.tableau + ", specialité :" + specialite + ", adresse: " + adresse + " ]";

    }

    public void inscrire(fr.umontpellier.iut.exo1.Etudiants e1){
        this.tableau.add(e1);
    }
    public void desinscrire(Etudiants e1) {
        this.tableau.remove(e1);
    }
}
