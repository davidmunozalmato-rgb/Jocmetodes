public class Guerrer extends Mecanicas {

    private Guerrer(String nom, int nivell, int puntsvida) {
        super(nom, nivell, puntsvida);
        puntsvida = 125;
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
