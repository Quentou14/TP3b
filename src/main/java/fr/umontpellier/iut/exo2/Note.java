package fr.umontpellier.iut.exo2;

public class Note {
    private int valeur;
    private Matière M;

    /*public Note(int valeur, Matière m, String in, int coef) {
        super(in, coef);

        this.valeur = valeur;
        M = m;
    }*/
    public Note(int valeur, Matière m) {


        this.valeur = valeur;
        M = m;
    }

    public int getNote() {
        return this.valeur;
    }

    public void setNote(int n) {
        this.valeur = n;
    }

    public Matière getM() {
        return M;
    }
}
