package jana60.geometria;

/*una classe Rettangolo con due attributi interi: base e altezza. 
 *La classe ha due metodi che calcolano e restituiscono, rispettivamente,
 *l’area e il perimetro del rettangolo.
 */

public class Rettangolo {
	// attributi
	int baseRettangolo;
	int altezzaRettangolo;

	// metodi
	int areaRettangolo() {
		return baseRettangolo * altezzaRettangolo;
	}

	int perimetroRettangolo() {
		return (baseRettangolo + altezzaRettangolo) * 2;
	}

	void stampaPerimetro() {
		System.out.println("Il perimetro è: " + perimetroRettangolo());
	}

	void stampaArea() {
		System.out.println("L'area è: " + areaRettangolo());
	}

}
