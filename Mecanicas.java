public class Mecanicas {
    protected String nom;
    protected int nivell;
    protected int puntsvida;

    protected Mecanicas(String nom, int nivell, int puntsvida) {
        this.nom = nom;
        this.nivell = nivell;
        this.puntsvida = puntsvida;
    }

    public String getNom() {
        return nom;
    }

    public int getNivell() {
        return nivell;
    }

    public int setPuntsvida() {
        return puntsvida;
    }
}
