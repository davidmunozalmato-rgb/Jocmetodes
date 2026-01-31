public class Monstre extends personajes {

    public Monstre(String nom, int nivell, int puntsvida) {
        super("Bestia", 0, 100);
    }

    public void perdrevidapermag() {
        this.puntsvida -= 20;
    }
}
