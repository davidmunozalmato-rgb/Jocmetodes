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

    public void perdrevidaperBESTIA() {
        this.puntsvida -= 20;
    }

    public void perdrevidaperGUERRER() {
        this.puntsvida -= 20;
    }

    public void atacarMag(Mag mag) {
        mag.perdrevidaperGUERRER();
    }

    public void atacarBestia(Monstre monstre) {
        monstre.perdrevidaperGUERRER();
    }

    public void atacarGuerrer(Guerrer guerrer) {
        guerrer.perdrevidaperGUERRER();
    }

    public void comprobarvida() {
        if (this.puntsvida <= 0) {
            System.out.println("Ha mort el guerrer");
        }

    }
}
