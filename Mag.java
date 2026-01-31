public class Mag extends personajes {

    private int mana = 100;

    public Mag() {
        super("Mag", 1, 50);
    }

    public Mag(String nom, int nivell, int puntsvida) {
        super(nom, nivell, puntsvida);
    }

    public void setMana(int mana) {
        this.mana = Math.max(0, mana);
    }

    public void perdreMana() {
        this.mana -= 10;

    }

    public void perdrevidaperMAG() {
        this.puntsvida -= 10;
    }

    public void perdrevidaperBESTIA() {
        this.puntsvida -= 20;
    }

    public void perdrevidaperGUERRER() {
        this.puntsvida -= 15;
    }

    public void veureMana() {
        System.out.println("El mag té " + this.mana + " punts de mana.");
    }

    public void atacarBestia(Monstre monstre) {
        System.out.println("El mag ataca amb una flamarada.");
        monstre.perdrevidapermag();
    }

    public void atacarGuerrer(Guerrer guerrer) {
        System.out.println("El mag ataca amb una flamarada.");
        guerrer.perdrevidaperMAG();
    }

    public void atacarMag(Mag mag) {
        System.out.println("El mag ataca amb una flamarada.");
        mag.perdrevidaperMAG();
    }

    public void comprobarvida() {
        if (this.puntsvida <= 0) {
            System.out.println("Ha mort el mag");
        }

    }

}
