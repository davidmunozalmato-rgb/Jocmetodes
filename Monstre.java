public class Monstre extends personajes {

    public Monstre() {
        super("Bestia", 1, 100);
    }

    public Monstre(String nom, int nivell, int puntsvida) {
        super(nom, nivell, puntsvida);
    }

    public void perdrevidapermag() {
        this.puntsvida -= 20;
    }
}
