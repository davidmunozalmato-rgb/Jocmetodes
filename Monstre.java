public class Monstre extends Mecanicas {

    private Monstre(String nom, int nivell, int puntsvida) {
        super(nom, nivell, puntsvida);
        puntsvida = 100;
    }

    public int getNivell() {
        return nivell;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntsvida() {
        return puntsvida;
    }
}
