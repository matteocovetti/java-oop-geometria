package jana60.geometria;

import java.util.Scanner;

/* una classe Main contenente il metodo main, nel quale chiedete all’utente di inserire, da console,
 * i valori di base e di altezza con cui istanziare un nuovo oggetto Rettangolo.
 * Dopo averlo istanziato, stampate a video il perimetro e l’area.
 */

public class Main {

	public static void main(String[] args) {
		Rettangolo rettangolo1 = new Rettangolo();

		// aggiungo scanner
		Scanner scan = new Scanner(System.in);

		// chiedo di inserire base
		System.out.print("Inserisci il valore della base del rettangolo: ");
		rettangolo1.baseRettangolo = scan.nextInt();

		// chiedo di inserire altezza
		System.out.print("Inserisci il valore dell'altezza del rettangolo: ");
		rettangolo1.altezzaRettangolo = scan.nextInt();

		// stampo perimetro
		rettangolo1.stampaPerimetro();

		// stampo area
		rettangolo1.stampaArea();

		scan.close();
	}

}
