package fr.umontpellier.iut.exo2;

import fr.umontpellier.iut.exo1.Departement;
import fr.umontpellier.iut.exo1.Etudiants;

import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
    public static void main(String[] args) {

        LocalDate maDate = LocalDate.of(2021, Month.FEBRUARY, 1);

        Etudiants lolo = new Etudiants("Paul", "Dupond", "p.dupond@gmail.fr", "547 Rue de la paix");
        Etudiants toto = new Etudiants("Paul", "Dupond", "p.dupond@gmail.fr", "547 Rue de la paix");
        toto.setNom("Marie");
        lolo.toString();
        toto.toString();

        Departement monDepInfo = new Departement("Informatique", "Bat K");
        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(toto);
        monDepInfo.desinscrire(toto);
    }

}

