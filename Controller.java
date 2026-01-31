import java.util.Scanner;
import java.util.Random;

public class Controller {

    Scanner scanner;
    personajes t;

    public Controller() {
        scanner = new Scanner(System.in);

    }

    public void run() {
        boolean sortir = false;
        while (!sortir) {
            System.out.println("Tria el persoantge amb el que lluitaras");
            System.out.println("1. Guerrer");
            System.out.println("2. Mag");
            System.out.println("3. Bestia");
            System.out.println("4. Sortir");
            System.out.print("Tria una opció: ");

            int opcio = scanner.nextInt();
            scanner.nextLine();

            switch (opcio) {
                case 1:
                    t = new Guerrer();
                    System.out.println("Guerrer creat!");
                    break;
                case 2:
                    t = new Mag();
                    System.out.println("Mag creat!");
                    break;
                case 3:
                    t = new Monstre();
                    System.out.println("Bestia creat!");
                    break;
                case 4:
                    sortir = true;
                    break;
                default:
                    System.out.println("Opció no vàlida.");
                    break;
            }
            int random = new Random().nextInt(0, 3);
            String enemic = "";
            switch (random) {
                case 0:
                    enemic = "Guerrer";
                    break;
                case 1:
                    enemic = "Mag";
                    break;
                case 2:
                    enemic = "Bestia";
                    break;
            }

            System.out.println("Lluitaras contra: " + enemic);

            int randomCarta = new Random().nextInt(0, 10);
            String carta = "";
            switch (randomCarta) {
                case 0:
                    carta = "Escut +20 de vida";
                    break;
                case 1:
                    carta = "Pocio +50 de vida";
                    break;
                case 2:
                    carta = "Pocio +50 de mana";
                    break;
                case 3:
                    carta = "Atac al enemic de 20 punts";
                    break;
                case 4:
                    carta = "Atac al enemic de 30 punts";
                    break;
                case 5:
                    carta = "Atac al enemic de 40 punts";
                    break;
                case 6:
                    carta = "Atac al enemic de 50 punts";
                    break;
                case 7:
                    carta = "L'enemic no pot atacar durant un torn";
                    break;
                case 8:
                    carta = "VIGILA CARTA DOLENTA perds 20 punts de vida";
                    break;
                case 9:
                    carta = "VIGILA CARTA DOLENTA el teu proxim atac farà la meitat de mal";
                    break;
                case 10:
                    carta = "No Has tingut sort";
                    break;
            }
            System.out.println("Has tret la carta: " + carta);
            System.out.println("QUE COMNÇI LA BATALLA!!!");
        }
    }
}