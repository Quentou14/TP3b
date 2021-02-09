package fr.umontpellier.iut.exo2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Etudiants {
    private String prenom;
    private String nom;
    private String mail;
    private String adresse;
    private ArrayList<Note> liste;

    public Etudiants(String p, String n, String m, String a) {
        prenom = p;
        nom = n;
        mail = m;
        adresse = a;
        this.liste = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Etudiant [ nom:" + nom +
                ", prenom:" + prenom + ", e-mail:" + mail + ", adresse postal:" + adresse + " ]";
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void noter(int v, Matière m) {
        Note n = new Note(v, m);
        this.liste.add(n);
    }


    public double calculMoyenne() {
        double somme = 0;
        int i = 0;
        if (liste.size() == 0) {
            return 0;
        } else {
            for (i = 0; i < liste.size(); i++) {
                somme += liste.get(i).getNote() * liste.get(i).getM().getCoef();
            }
            return (somme / i);

        }
    }
}

