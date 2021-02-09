package fr.umontpellier.iut.exo1;

import java.util.ArrayList;
import java.awt.Color;

public class Departement {
    private ArrayList<Etudiants> tableau;
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

    public void inscrire(Etudiants e1){
        this.tableau.add(e1);
    }
    public void desinscrire(Etudiants e1) {
        this.tableau.remove(e1);
    }
}
