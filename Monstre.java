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

    public void perdrevidaperGUERRER() {
        this.puntsvida -= 20;
    }

    public void perdrevidaperBESTIA() {
        this.puntsvida -= 20;
    }

    public void atacarguerrer(Guerrer guerrer) {
        guerrer.perdrevidaperBESTIA();
    }

    public void atacarmag(Mag mag) {
        mag.perdrevidaperBESTIA();
    }

    public void atacarBestia() {
        this.puntsvida -= 20;
    }

    public void comprobarvida() {
        if (this.puntsvida <= 0) {
            System.out.println("Ha mort la bestia");
        }

    }
}
