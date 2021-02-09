package fr.umontpellier.iut.exo2;

public class Matière {
    private String intitule;
    private int Coef;



    public Matière(String in, int coef) {
        this.intitule = in;
        this.Coef = coef;

    }


    public int getCoef() {
        return this.Coef;
    }
}
