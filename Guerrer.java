public class Guerrer extends personajes {

    public Guerrer(String nom, int nivell, int puntsvida) {
        super("Guerrer", 0, 100);
    }

    public void perdrevidaperMAG() {
        this.puntsvida -= 20;
    }
}
