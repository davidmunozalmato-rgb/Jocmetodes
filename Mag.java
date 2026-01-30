public class Mag extends Mecanicas {

    private Mag(String nom, int nivell, int puntsvida) {
        super(nom, nivell, puntsvida);
        puntsvida = 50;
    }

    public int getNivell() {
        return nivell;
    }

    public String getNom() {
        return nom;
    }

    public void setPuntsvida(int puntsvida) {
        this.puntsvida = puntsvida;
    }
}
