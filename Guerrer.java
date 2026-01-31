public class Guerrer extends personajes {

    public Guerrer() {
        super("Guerrer", 1, 100);
    }

    public Guerrer(String nom, int nivell, int puntsvida) {
        super(nom, nivell, puntsvida);
    }

    public void perdrevidaperMAG() {
        this.puntsvida -= 20;
    }
}
