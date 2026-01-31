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

    public void perdrevidaperMAG2() {
        this.puntsvida -= 10;
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
        mag.perdrevidaperMAG2();
    }

}
