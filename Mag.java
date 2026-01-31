public class Mag extends personajes {

    private int mana = 100;

    public Mag(String nom, int nivell, int puntsvida) {
        super(nom, nivell, puntsvida);
    }

    public void setMana(int mana) {
        this.mana = Math.max(0, mana);
    }

    public void perdreMana() {
        this.mana -= 10;

    }

    public void veureMana() {
        System.out.println("El mag té " + this.mana + " punts de mana.");
    }

}
