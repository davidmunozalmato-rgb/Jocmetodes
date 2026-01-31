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
            personajes enemicObj = null;
            String enemic = "";
            switch (random) {
                case 0:
                    enemicObj = new Guerrer();
                    enemic = "Guerrer";
                    break;
                case 1:
                    enemicObj = new Mag();
                    enemic = "Mag";
                    break;
                case 2:
                    enemicObj = new Monstre();
                    enemic = "Bestia";
                    break;
            }

            System.out.println("Lluitaras contra: " + enemic);

            int randomCarta = new Random().nextInt(0, 10);
            for (int i = 0; i < 5; i++) {
                System.out.println("Vols atacar?-1-Si-2-No");
                int o = scanner.nextInt();
                if (o == 1) {
                    if (opcio == 1) { // Jo soc Guerrer
                        if (random == 0)
                            ((Guerrer) enemicObj).perdrevidaperGUERRER();
                        else if (random == 1)
                            ((Mag) enemicObj).perdrevidaperGUERRER();
                        else if (random == 2)
                            ((Monstre) enemicObj).perdrevidaperGUERRER();
                    } else if (opcio == 2) { // Jo soc Mag
                        if (random == 0)
                            ((Guerrer) enemicObj).perdrevidaperMAG();
                        else if (random == 1)
                            ((Mag) enemicObj).perdrevidaperMAG();
                        else if (random == 2)
                            ((Monstre) enemicObj).perdrevidapermag();
                    } else if (opcio == 3) { // Jo soc Monstre
                        if (random == 0)
                            ((Guerrer) enemicObj).perdrevidaperBESTIA();
                        else if (random == 1)
                            ((Mag) enemicObj).perdrevidaperBESTIA();
                        else if (random == 2)
                            ((Monstre) enemicObj).perdrevidaperBESTIA();
                    }

                    System.out.println("vols fer servir carta?--Si-1---No----2");
                    int L = scanner.nextInt();
                }
                enemicObj.comprobarvida();
                t.comprobarvida();
            }
        }
    }
}