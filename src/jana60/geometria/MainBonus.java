package jana60.geometria;

import java.util.Scanner;

/*chiedere all’utente per 5 volte di definire le dimensioni di un rettangolo
 *e stampare a video l’area del rettangolo più grande
 */

public class MainBonus {

	public static void main(String[] args) {
		Rettangolo rettangolo1 = new Rettangolo();

		int areaMaggiore = 0;

		// aggiungo scanner
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Inserisci base del rettangolo numero " + (i + 1) + ":");
			rettangolo1.baseRettangolo = scan.nextInt();

			System.out.print("Inserisci altezza del rettangolo numero " + (i + 1) + ":");
			rettangolo1.altezzaRettangolo = scan.nextInt();

			if (rettangolo1.areaRettangolo() >= areaMaggiore) {
				areaMaggiore = rettangolo1.areaRettangolo();
			}
		}

		System.out.println("L'area maggiore è: " + areaMaggiore);

		// chiedo di inserire base
//		System.out.print("Inserisci il valore della base del rettangolo: ");
//		rettangolo1.baseRettangolo = scan.nextInt();

		// chiedo di inserire altezza
//		System.out.print("Inserisci il valore dell'altezza del rettangolo: ");
//		rettangolo1.altezzaRettangolo = scan.nextInt();

		// stampo perimetro
//		rettangolo1.stampaPerimetro();

		// stampo area
//		rettangolo1.stampaArea();

		scan.close();

	}

}
